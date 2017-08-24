package com.agivision.alltest.packetupdate;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.agivision.alltest.R;

import java.io.File;

/**
 * Created by Administrator on 2017/1/16 0016.
 *
 */
public class UpdateApplication extends Activity implements View.OnClickListener {

    private static String TAG = "UpdateApplication";
    private static int ACTIVITY_REQUESTCODE_FIND = 1;
    private EditText et_apkpath;
    private Button btn_update;
    private Button btn_goFind;
    private Button btn_look_file_list;
    private EditText et_file_path;
    private TextView tv_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.update_application);
        initView();

    }

    private void initView() {
        et_apkpath = (EditText) findViewById(R.id.et_apkpath);
        btn_update = (Button) findViewById(R.id.btn_updateapk);
        btn_goFind = (Button) findViewById(R.id.btn_findFile);
        btn_look_file_list = (Button) findViewById(R.id.btn_lookFile);
        tv_show = (TextView) findViewById(R.id.tv_show_msg);
        et_file_path = (EditText) findViewById(R.id.et_file_path);

        btn_update.setOnClickListener(this);
        btn_goFind.setOnClickListener(this);
        btn_look_file_list.setOnClickListener(this);
    }

    private void update() {
        String path=et_apkpath.getText().toString().trim();
        //调用系统组件
        Intent intent=new Intent();
        //intent.setAction("android.intent.action.VIEW");
        intent.setAction(Intent.ACTION_VIEW);
        //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        //intent.addCategory("android.intent.category.DEFAULT");
        // /mnt/sdcard
        if(Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())){

            Log.i("ExternalStorageDir() = ", Environment.getExternalStorageDirectory().toString());

            File file = new File(Environment.getExternalStorageDirectory() + path);

            Log.i("UpdateApplication", file.getAbsolutePath() + "|" + file.isAbsolute() + "|"
                    + file.isDirectory() + "|" + file.isFile() + "|" + file.exists() + " | " +
                    Uri.fromFile(file));

            /*File file1 = new File("/storage");

            if (file1.isDirectory()) {
                for (String str: file1.list()) {
                    Log.i(TAG, str);
                }
            }*/

            PackageManager pm = getPackageManager();
            try {
                PackageInfo pi = pm.getPackageInfo(getPackageName(), 0);
                Log.i(TAG, "versionCode = " + pi.versionCode + " | versionName = " + pi.versionName);

            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }

            intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
            startActivity(intent);

        } else {
            Toast.makeText(this, "SD卡当前不可用", Toast.LENGTH_LONG).show();
        }

        Log.i("getRootDirectory() = ", Environment.getRootDirectory().toString());
        /*Log.i("getDataDirectory() = ", Environment.getDataDirectory().toString());
        Log.i("nalStorageState() = ", Environment.getExternalStorageState());
        Log.i("DownloadCacheDirec() = ", Environment.getDownloadCacheDirectory().toString());

        Log.i("ExternalStorageDir() = ", Environment.getExternalStorageDirectory().toString());
        Log.i("rnalStorageEmul() = ", Environment.isExternalStorageEmulated() + "");
        Log.i("Removable() = ", Environment.isExternalStorageRemovable() + "");*/
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_updateapk:
                update();
                
                break;
            case R.id.btn_findFile:
                startFindIntent();
                break;
            case R.id.btn_lookFile:
                showFileList();
                //showFileList();
                break;
            default:
        }
    }

    private void showFileList() {
        File file = new File(et_file_path.getText().toString());
        String files = "";
        for (String str: file.list()) {
            files += str + " , ";
        }
        tv_show.setText(files);
    }

    private void startFindIntent() {

        if (Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())) {

            if (haveAPK("/storage")) {
                Intent goFileIntent = new Intent(Intent.ACTION_GET_CONTENT);
                goFileIntent.setType("*/*");
                goFileIntent.addCategory(Intent.CATEGORY_OPENABLE);

                try {
                    startActivityForResult(Intent.createChooser(goFileIntent, "选择文件"), ACTIVITY_REQUESTCODE_FIND);

                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(this, "文件管理器异常", Toast.LENGTH_SHORT).show();
                }
            } else {

                Toast.makeText(this, "no apk", Toast.LENGTH_LONG).show();
            }

        } else {
            Toast.makeText(this, "SD卡当前不可用", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (resultCode == Activity.RESULT_OK) {
            if (requestCode == ACTIVITY_REQUESTCODE_FIND) {
                Uri uri = data.getData();

                //Log.i(TAG, data.getStringExtra("filepath"));
                Log.i(TAG, uri.toString());
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    private boolean haveAPK(String path) {
        File file = new File(path);
        if (file.isDirectory()) {

            for (File f : file.listFiles()) {
                if (f.isFile()) {
                    return true;
                } else if (f.isDirectory()) {
                    return haveAPK(f.getPath());
                }
            }
        }
        return false;
    }
}
