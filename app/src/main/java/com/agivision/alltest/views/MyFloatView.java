package com.agivision.alltest.views;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import com.agivision.alltest.MyApplication;

/**
 * //通过重写onTouch 和 updateview， 实现view的可移动和点击事件
 * Created by Administrator on 2016/11/22 0022.
 *
 */
public class MyFloatView extends View {

    private float mTouchStartX;
    private float mTouchStartY;
    private float x;
    private float y;

    //private WindowManager wm=(WindowManager)getContext().getApplicationContext().getSystemService(Context.WINDOW_SERVICE);
    //private WindowManager.LayoutParams wmParams = ((MyApplication)(getContext().getApplicationContext())).getMywmParams();

    public MyFloatView(Context context) {
        super(context);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        x = event.getRawX();
        y = event.getRawY()-38;// top system menu

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                //获取相对View的坐标，即以此View左上角为原点
                mTouchStartX =  event.getX();
                mTouchStartY =  event.getY();

                Log.i("startP", "startX" + mTouchStartX + "====startY" + mTouchStartY);

                break;
            case MotionEvent.ACTION_MOVE:
                updateViewPosition();
                break;

            case MotionEvent.ACTION_UP:
                updateViewPosition();
                //mTouchStartX=mTouchStartY=0;

                //Toast.makeText(getContext(), "testtest", Toast.LENGTH_SHORT).show();

                //((MyApplication)getContext()).removeView(this);

                break;
        }
        return true;
    }

    private void updateViewPosition(){
        //更新浮动窗口位置参数

        //wmParams.x = (int)( x-mTouchStartX);
        //wmParams.y = (int)(y-mTouchStartY);
        //wm.updateViewLayout(this, wmParams);

    }
}
