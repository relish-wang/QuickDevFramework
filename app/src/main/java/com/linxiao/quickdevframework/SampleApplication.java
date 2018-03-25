package com.linxiao.quickdevframework;

import com.linxiao.framework.QDFApplication;
import com.squareup.leakcanary.LeakCanary;

/**
 *
 * Created by linxiao on 2016-11-27.
 */
public class SampleApplication extends QDFApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);
    }


}
