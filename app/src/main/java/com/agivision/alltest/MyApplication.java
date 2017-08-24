package com.agivision.alltest;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;

/**
 * Created by Administrator on 2016/6/24 0024.
 *
 */
public class MyApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }

    private WindowManager.LayoutParams wmParams = new WindowManager.LayoutParams();

    public WindowManager.LayoutParams getMywmParams(){
        return wmParams;
    }

    public void removeView(View view) {
        Log.i("test", "remove" + view.getClass());
        WindowManager mWindowManager = (WindowManager)this.getSystemService(Context.WINDOW_SERVICE);
        mWindowManager.removeView(view);
    }
}
