package com.malei.mylib;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by malei on 2018/4/8.
 */

public class ToastUtils {

    public static void show(Context context, String str){
        Toast.makeText(context, str,Toast.LENGTH_LONG).show();
    }
}
