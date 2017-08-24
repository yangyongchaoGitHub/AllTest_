package com.agivision.alltest.gps;

import android.app.Activity;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.agivision.alltest.R;

/**
 * Created by Administrator on 2017/3/21 0021.
 *
 */
public class GPSservice extends Activity {
    private TextView msg_tv;

    private static String TAG = "GPSservice";
    private LocationManager locationManager;

    protected final LocationListener listener = new LocationListener() {
        @Override
        public void onLocationChanged(Location location) {
            show(getLocationInfo(location));
            Log.i(TAG, getLocationInfo(location));
        }

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {
            show("status changed");
            Log.i(TAG, "status changed");
        }

        @Override
        public void onProviderEnabled(String provider) {
            show("enabled");
            Log.i(TAG, "enabled");
        }

        @Override
        public void onProviderDisabled(String provider) {
            show("disabled");
            Log.i(TAG, "disabled");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gps_activity);
        locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
        msg_tv = (TextView) findViewById(R.id.msg_gps_tv);
    }

    @Override
    protected void onResume() {
        super.onResume();
        // 指定一个 Provider
        String currentProvider = LocationManager.NETWORK_PROVIDER;
        show(currentProvider);
        Log.d(TAG, "CurrentProvider: " + currentProvider);
        // 获取 Provider 最后一个记录的地址信息
        final Location lastKnownLocation = locationManager
                .getLastKnownLocation(currentProvider);
        if (lastKnownLocation != null) {
            show(getLocationInfo(lastKnownLocation));
            Log.d(TAG, "LastKnownLocation: "
                    + getLocationInfo(lastKnownLocation));
        } else {
            show("Last Location Unkown!");
            Log.d(TAG, "Last Location Unkown!");
        }
        // 注册监听器接受位置更新
        locationManager.requestLocationUpdates(currentProvider, 0, 0, listener);
    }

    @Override
    protected void onPause() {
        super.onPause();
        // 移除监听器
        locationManager.removeUpdates(listener);
        show("LocationListener: " + listener + " removed.");
        Log.d(TAG, "LocationListener: " + listener + " removed.");
    }


    private String getLocationInfo(Location location) {
        String info = "";
        info += "Longitude:" + location.getLongitude();
        info += ", Latitude:" + location.getLatitude();
        if (location.hasAltitude()) {
            info += ", Altitude:" + location.getAltitude();
        }
        if (location.hasBearing()) {
            info += ", Bearing:" + location.getBearing();
        }
        return info;
    }

    private void show(final String strMsg) {
        msg_tv.post(new Runnable() {
            @Override
            public void run() {
                String str = msg_tv.getText().toString();
                str += " " + strMsg;
                msg_tv.setText(str);
            }
        });
    }
}
