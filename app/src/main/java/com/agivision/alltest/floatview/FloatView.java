package com.agivision.alltest.floatview;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.agivision.alltest.R;
import com.agivision.alltest.views.MyFloatView;

/**
 * Created by Administrator on 2017/1/10 0010.
 *
 */
public class FloatView extends Activity implements View.OnClickListener {
    private MyFloatView floatView;
    private Button btn_show;
    private Button btn_show2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.floatview_activity);
        initView();
    }

    private void initView() {
        btn_show = (Button) findViewById(R.id.btn_float_window);
        btn_show.setOnClickListener(this);
        btn_show2 = (Button) findViewById(R.id.btn_float_window2);
        btn_show2.setOnClickListener(this);
    }


    public void showViewMove() {
        floatView = new MyFloatView(getApplicationContext());
        floatView.setBackground(getResources().getDrawable(R.drawable.bg_132x34_7abaf2));
        FloatWindowManager fwm = new FloatWindowManager();
        fwm.showFloatWindow(this, floatView);
    }

    private void showAllWindowView() {
        LayoutInflater.from(this).inflate(R.layout.float_view_test, null);
        FloatWindowManager fwm = new FloatWindowManager();
        fwm.showFloatWindow(this, floatView);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_float_window:
                //showViewMove();
                break;
            case R.id.btn_float_window2:

                break;
            default:
        }
    }
}
