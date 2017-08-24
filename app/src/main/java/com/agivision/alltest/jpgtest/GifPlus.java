package com.agivision.alltest.jpgtest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.agivision.alltest.R;
import com.bumptech.glide.Glide;

/**
 * Created by Administrator on 2017/8/10 0010.
 *
 */
public class GifPlus extends Activity {
    private ImageView iv_tsest1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gif_test_plus);
        iv_tsest1 = (ImageView) findViewById(R.id.iv_gif_plus_tsest1);

        Glide.with(this).load(R.drawable.tesetgif).asGif().into(iv_tsest1);
    }
}
