package com.bw.day18rk;

import android.app.Application;
import android.content.Context;

/**
 * author: 斛万珺
 * data: 2020/3/12 16:16:34
 * function:
 */
public class App extends Application {

    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context=this;
    }
}
