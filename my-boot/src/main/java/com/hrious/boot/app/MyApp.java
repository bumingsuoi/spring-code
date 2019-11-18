package com.hrious.boot.app;

import com.hrious.boot.app.MyApplication;
import com.hrious.boot.config.AppConfig;

public class MyApp {
    public static void main(String[] args) {
        MyApplication.run(AppConfig.class);
    }
}
