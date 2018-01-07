package com.cachecats.meituan;

import android.app.Application;
import android.content.Context;

/**
 * Created by solo on 2018/1/7.
 */

public class MyApplication extends Application{

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();

        mContext = getApplicationContext();

    }

    /**
     * 获取ApplicationContext
     * @return
     */
    public static Context getAppContext(){
        return mContext;
    }

}