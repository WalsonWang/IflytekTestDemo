package com.iflytek.walson.iflytektestdemo;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/4/12.
 */

public class utils {
    public static void showToast(Context context, String content) {
        Toast.makeText(context, content, Toast.LENGTH_LONG).show();
    }
}
