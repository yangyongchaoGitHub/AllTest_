package com.agivision.alltest.sugartest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.agivision.alltest.R;
import com.agivision.alltest.model.Actuator;
import com.agivision.alltest.model.Heatmeter;
import com.agivision.alltest.model.House;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/11 0011.
 *
 */
public class AddAndSearch extends Activity implements View.OnClickListener {
    public static SimpleDateFormat sdfl = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
    Button insert_btn;
    Button search_house_btn;
    Button search_actuator_btn;
    Button search_heatmeter_btn;
    Button test1_btn;
    TextView log_tv;
    List<House> houses = House.listAll(House.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sugar_test_activity);
        initView();

    }

    private void initView() {
        insert_btn = (Button) findViewById(R.id.sugar_test_insert_house_actuator_heatmeter_btn);
        search_house_btn = (Button) findViewById(R.id.sugar_test_get_all_house_btn);
        search_actuator_btn = (Button) findViewById(R.id.sugar_test_get_all_actuator_btn);
        search_heatmeter_btn = (Button) findViewById(R.id.sugar_test_get_all_heatmeter_btn);
        test1_btn = (Button) findViewById(R.id.sugar_test_get_test1_btn);
        log_tv = (TextView) findViewById(R.id.sugar_test_log_tv);

        insert_btn.setOnClickListener(this);
        search_house_btn.setOnClickListener(this);
        search_actuator_btn.setOnClickListener(this);
        search_heatmeter_btn.setOnClickListener(this);
        test1_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sugar_test_get_test1_btn:
                House house = new House();
                if (house.getId() == null) {
                    Log.i("sugatTest", "house id is null");
                }
                houses.add(house);
                house.save();

                if (house.getId() != null) {
                    Log.i("sugatTest", "house id is " + house.getId());
                }

                for (House h : houses) {
                    if (h.getId() != null) {
                        Log.i("sugatTets", "house id is " + h.getId());
                    }
                }
                break;

            case R.id.sugar_test_get_all_actuator_btn:
                log_tv.setText(log_tv.getText().toString() + " actuator search start " + sdfl.format(System.currentTimeMillis()) + "  ");
                Actuator.listAll(Actuator.class);
                log_tv.setText(log_tv.getText().toString() + " actuator search start " + sdfl.format(System.currentTimeMillis()) + "  ");
                break;
            case R.id.sugar_test_get_all_heatmeter_btn:
                log_tv.setText(log_tv.getText().toString() + " heatmeter search start " + sdfl.format(System.currentTimeMillis()) + "  ");
                Heatmeter.listAll(Heatmeter.class);
                log_tv.setText(log_tv.getText().toString() + " heatmeter search end " + sdfl.format(System.currentTimeMillis()) + "  ");
                break;
            case R.id.sugar_test_get_all_house_btn:
                log_tv.setText(log_tv.getText().toString() + " house search start " + sdfl.format(System.currentTimeMillis()) + "  ");
                List<House> houses = House.listAll(House.class);
                List<Heatmeter> heatmeters = Heatmeter.listAll(Heatmeter.class);
                List<Actuator> actuators = Actuator.listAll(Actuator.class);
                for (House it : houses) {
                    for (Actuator actuator : actuators) {
                        if (actuator.getHwaddr().equals(it.getActuator())) {
                            break;
                        }
                    }

                    for (Heatmeter heatmeter : heatmeters) {
                        if (heatmeter.getHwaddr().equals(it.getHeatmeter())) {
                            break;
                        }
                    }
                }

                log_tv.setText(log_tv.getText().toString() + " house search end " + sdfl.format(System.currentTimeMillis()) + "  ");
                break;
            case R.id.sugar_test_insert_house_actuator_heatmeter_btn:

                String actuatorHwaddrEnd = "001111";
                int actuatorHwaddr = 12365485;
                String heatmeterHwaddrEnd = "4782ef";
                int heatmeterHwaddr = 52369871;
                int hashcode = 0;

                for (int i = 0; i < 4000; i++) {
                    House house_add = new House();
                    house_add.setHashcode((hashcode++) + System.currentTimeMillis() + "");
                    Actuator actuator = new Actuator();
                    actuator.setHwaddr((actuatorHwaddr++) + actuatorHwaddrEnd);
                    Heatmeter heatmeter = new Heatmeter();
                    heatmeter.setHwaddr((heatmeterHwaddr++) + heatmeterHwaddrEnd);
                    heatmeter.save();
                    actuator.save();
                    house_add.setHeatmeter(heatmeter.getHwaddr());
                    house_add.setActuator(actuator.getHwaddr());
                    house_add.save();
                }
                break;
            default:
        }
    }
}
