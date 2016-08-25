package com.example.yhzhao.mydemo;

import android.widget.Toast;

/**
 * Created by yhzhao on 2016/8/25.
 */
public class ToastUtil {
    private static Toast toast;

    public static void showToas(String toastString){
        if (toast == null){
            toast = Toast.makeText(MainApplication.appContext, toastString, Toast.LENGTH_SHORT);
        }else {
            toast.setText(toastString);
        }
        toast.show();
    }

}
