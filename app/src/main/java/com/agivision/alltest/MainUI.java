package com.agivision.alltest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.agivision.alltest.bluetoothTest.BluetoothTestMain;
import com.agivision.alltest.floatview.FloatView;
import com.agivision.alltest.gprs.GprsTest;
import com.agivision.alltest.gps.GPSservice;
import com.agivision.alltest.jpgtest.GifPlus;
import com.agivision.alltest.jpgtest.GifTest;
import com.agivision.alltest.packetupdate.UpdateApplication;
import com.agivision.alltest.sugartest.AddAndSearch;

/**
 * Created by Administrator on 2017/1/10 0010.
 *
 */
public class MainUI extends Activity implements View.OnClickListener {
    Button btn_float;
    Button btn_gif;
    Button btn_grps;
    Button btn_install;
    Button gps_btn;
    Button sugar_btn;
    Button btn_bluetooth;
    Button btn_giftestplus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainui_activity);
        initView();
    }

    private void initView() {
        btn_float = (Button) findViewById(R.id.btn_go_float);
        btn_gif = (Button) findViewById(R.id.btn_giftest);
        btn_grps = (Button) findViewById(R.id.btn_gprs_strength);
        btn_install = (Button) findViewById(R.id.btn_install_application);
        gps_btn = (Button) findViewById(R.id.gps_btn);
        sugar_btn = (Button) findViewById(R.id.sugar_test_btn);
        btn_bluetooth = (Button) findViewById(R.id.btn_bluetooth_test);
        btn_giftestplus = (Button) findViewById(R.id.btn_giftestplus);

        btn_float.setOnClickListener(this);
        btn_gif.setOnClickListener(this);
        btn_grps.setOnClickListener(this);
        btn_install.setOnClickListener(this);
        gps_btn.setOnClickListener(this);
        sugar_btn.setOnClickListener(this);
        btn_bluetooth.setOnClickListener(this);
        btn_giftestplus.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_giftestplus:
                startActivity(new Intent(this, GifPlus.class));
                break;

            case R.id.btn_bluetooth_test:
                startActivity(new Intent(this, BluetoothTestMain.class));
                break;
            case R.id.sugar_test_btn:
                startActivity(new Intent(this, AddAndSearch.class));
                break;
            case R.id.btn_go_float:
                startActivity(new Intent(this, FloatView.class));
                break;
            case R.id.btn_giftest:
                startActivity(new Intent(this, GifTest.class));
                break;
            case R.id.btn_gprs_strength:
                startActivity(new Intent(this, GprsTest.class));
                break;
            case R.id.btn_install_application:
                startActivity(new Intent(this, UpdateApplication.class));
                break;
            case R.id.gps_btn:
                startActivity(new Intent(this, GPSservice.class));
            default:
        }
    }
}
