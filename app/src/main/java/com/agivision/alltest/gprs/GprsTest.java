package com.agivision.alltest.gprs;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.telephony.CellLocation;
import android.telephony.NeighboringCellInfo;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.util.Log;
import android.widget.TextView;

import com.agivision.alltest.R;

import java.util.List;

/**
 * Created by Administrator on 2017/1/12 0012.
 *
 */
public class GprsTest extends Activity {

    TextView tv_curr;
    PhoneStateListener psl;
    TelephonyManager tm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gprs_activity);

        tv_curr = (TextView) findViewById(R.id.tv_gprs_curr);

        initPhoneStateListener();

        tm = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);

        tm.listen(psl, PhoneStateListener.LISTEN_CELL_LOCATION);
        tm.listen(psl, PhoneStateListener.LISTEN_SIGNAL_STRENGTHS);

        if (tm.getCellLocation() != null) {
            psl.onCellLocationChanged(tm.getCellLocation());
        }

        final int type = tm.getNetworkType();
        Log.i("gprs", "networktype = " + type);

        /*tm.listen(new PhoneStateListener(){


            @Override
            public void onSignalStrengthsChanged(final SignalStrength signalStrength) {
                super.onSignalStrengthsChanged(signalStrength);

                if (tv_curr != null) {
                    tv_curr.setText("GsmSignalStrength = " + signalStrength.getGsmSignalStrength() +
                            " CdmaDbm = " + signalStrength.getCdmaDbm() +
                            " CdmaEcio = " + signalStrength.getCdmaEcio() +
                            " EvdoDbm = " + signalStrength.getEvdoDbm() +
                            " EvdoEcio = " + signalStrength.getEvdoEcio() +
                            " EvdoSnr = " + signalStrength.getEvdoSnr() +
                            " GsmBitErrorRate = " + signalStrength.getGsmBitErrorRate());
                }

                Log.i("GprsTest", signalStrength.getGsmSignalStrength() + " ");
            }
        }, PhoneStateListener.LISTEN_SIGNAL_STRENGTHS);*/

    }

    private void initPhoneStateListener() {
        psl = new PhoneStateListener(){

            @Override
            public void onCellLocationChanged(CellLocation location) {
                super.onCellLocationChanged(location);
                if (location instanceof GsmCellLocation) {
                    Log.i("GprsTest", "isGsmCellLocation");

                    Log.i("Lac = ", "" + ((GsmCellLocation) location).getLac());
                    Log.i("Cid = ", "" + ((GsmCellLocation) location).getCid());

                    /** 获取mcc，mnc */
                    String mccMnc = tm.getNetworkOperator();

                    if (mccMnc != null && mccMnc.length() >= 5) {
                        Log.i("Gprs", "mcc = " + mccMnc.substring(0, 3) +
                                " mnc = " + mccMnc.substring(3, 5));
                    }
                    if (((GsmCellLocation) location).getLac() != -1 &&
                            ((GsmCellLocation) location).getCid() != -1) {
                        //gsmCells.add(0, gsmCell);
                        // Collections.sort(gsmCells);
                        // /**最多保存近3个基站信息*/
                        // if (gsmCells.size() >3)
                        // gsmCells.remove(3);
                    }
                    List<NeighboringCellInfo> neighboringList = tm.getNeighboringCellInfo();
                    for (NeighboringCellInfo ni : neighboringList) {
                        //GsmCell gb = new GsmCell();
                        Log.i("Gprs", "NeighboringCellInfo mnc = " + mccMnc.substring(3, 5) +
                                "Lac = " + ni.getLac() +
                                "Cid = " + ni.getCid() +
                                "signal = " + -133 + 2 * ni.getRssi());
                    }
                } else {
                    Log.i("GprsTest", "order");
                    try {

                        Class cdmaClass = Class.forName("android.telephony.cdma.CdmaCellLocation");

                        CdmaCellLocation cdma = (CdmaCellLocation) location;
                        Log.i("BaseStationId = ", " baseStationId = " + cdma.getBaseStationId() +
                                " NetworkId = " + cdma.getNetworkId() +
                                " SystemId = " + cdma.getSystemId() +
                                " BaseStationLatitude = " + cdma.getBaseStationLatitude() +
                                " BaseStationLongitude = " + cdma.getBaseStationLongitude());

                        String mccMncorder = tm.getNetworkOperator();

                        if (mccMncorder != null && mccMncorder.length() >= 5) {
                            Log.i("Gprs", "mcc = " + mccMncorder.substring(0, 3) +
                                    " mnc = " + mccMncorder.substring(3, 5));
                        }

                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }

                    List<NeighboringCellInfo> neighboringList = tm.getNeighboringCellInfo();
                    for (final NeighboringCellInfo ni : neighboringList) {
                        //GsmCell gb = new GsmCell();
                        final String mccMncorder = tm.getNetworkOperator();
                        Log.i("Gprs", "NeighboringCellInfo mnc = " + mccMncorder.substring(3, 5) +
                                "Lac = " + ni.getLac() +
                                "Cid = " + ni.getCid() +
                                "signal = " + -133 + 2 * ni.getRssi());

                        tv_curr.post(new Runnable() {
                            @Override
                            public void run() {
                                tv_curr.setText("NeighboringCellInfo mnc = " + mccMncorder.substring(3, 5) +
                                        "Lac = " + ni.getLac() +
                                        "Cid = " + ni.getCid() +
                                        "signal = " + -133 + 2 * ni.getRssi());
                            }
                        });
                    }
                }
            }

            @Override
            public void onSignalStrengthsChanged(SignalStrength signalStrength) {

                final int asu=signalStrength.getGsmSignalStrength();
                Log.i("Gprs", "信号强度 = " + (-113+2 * asu));
                tv_curr.post(new Runnable() {
                    @Override
                    public void run() {
                        tv_curr.setText("onSignalStrengthsChanged = " + (-113+2 * asu) +
                                " | " + System.currentTimeMillis());
                    }
                });
                super.onSignalStrengthsChanged(signalStrength);
            }
        };
    }
}
