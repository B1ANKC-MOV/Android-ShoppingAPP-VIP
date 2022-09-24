package com.atguigu.shoppingmall.app;

import android.app.Application;
import android.content.Context;

public class MyAppliction extends Application {
    private static Context mContext;
    @Override
    public void onCreate() {
        super.onCreate();
        this.mContext = this;
    }
    // 获取全局上下文
    public static Context getContext() {
        return mContext;
    }

}
