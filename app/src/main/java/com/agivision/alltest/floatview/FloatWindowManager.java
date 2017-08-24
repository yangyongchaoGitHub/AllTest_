package com.agivision.alltest.floatview;

import android.content.Context;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import com.agivision.alltest.MyApplication;

/**
 * Created by Administrator on 2017/1/10 0010.
 *
 */
public class FloatWindowManager {

    private WindowManager mWindowManager;
    private WindowManager.LayoutParams param;

    public void showFloatWindow(Context context, View view) {
        mWindowManager = (WindowManager) context.getApplicationContext().getSystemService(Context.WINDOW_SERVICE);
        param = ((MyApplication) context.getApplicationContext()).getMywmParams();
        Log.i("FloatWindowsTest", "showViewMove()" + param + " --- " + mWindowManager);


        /*TextView tv = new TextView(getApplicationContext());

        tv.setText("报警报警报警!");
        tv.setBackgroundColor(getResources().getColor(R.color.transparent_red));
        tv.setGravity(Gravity.CENTER);
        tv.setTextColor(getResources().getColor(R.color.black));*/

        //tv.setBackground(getResources().getDrawable(R.drawable.cycle_calendar));
        //param.type = WindowManager.LayoutParams.TYPE_TOAST;     // 系统提示类型,重要
        param.type = WindowManager.LayoutParams.TYPE_SYSTEM_ALERT;     // 系统提示类型,重要
        param.format = 1;
        param.flags = WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE; // 不能抢占聚焦点
        param.flags = param.flags | WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH;
        param.flags = param.flags | WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS; // 排版不受限制
        param.alpha = 1.0f;

        param.gravity= Gravity.LEFT|Gravity.TOP;   //调整悬浮窗口至左上角
        //以屏幕左上角为原点，设置x、y初始值
        param.x=0;
        param.y=0;

        //设置悬浮窗口长宽数据
        param.width = ViewGroup.LayoutParams.MATCH_PARENT;
        param.height = 80;
        mWindowManager.addView(view, param);

    }
}
