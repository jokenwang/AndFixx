package com.jack.smpleexample;

import android.app.Application;
import android.os.Environment;
import android.util.Log;

import com.alipay.euler.andfix.patch.PatchManager;

import java.io.IOException;

/**
 * Created by ning.wang-2 on 16/1/22.
 */
public class ApplicationX extends Application {


    private static final String TAG = "ApplicationX";

    private PatchManager mPatchManager;

    private static final String APATCH_PATH = "/out.apatch";

    @Override
    public void onCreate() {
        super.onCreate();

        mPatchManager = new PatchManager(this);
        mPatchManager.init("1.0");
        Log.d(TAG, "onCreate: inited.");
        mPatchManager.loadPatch();
        Log.d(TAG, "apatch loaded.");

        try {
            String patchFile = Environment.getExternalStorageDirectory().getAbsolutePath() + APATCH_PATH;
            Log.d(TAG, " patchFile path = " + patchFile);
            //文件拷贝
            mPatchManager.addPatch(patchFile);
        } catch (IOException e) {
            e.printStackTrace();
            Log.e(TAG, e.getLocalizedMessage());
        }


    }
}
