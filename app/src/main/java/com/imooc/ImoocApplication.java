package com.imooc;

import android.app.Application;

import net.wequick.small.Small;

/**
 * Created by Administrator on 2017/7/11.
 */

public class ImoocApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Small.preSetUp(this); //small框架的初始化
    }
}
