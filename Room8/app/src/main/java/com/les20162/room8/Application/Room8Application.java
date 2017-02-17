package com.les20162.room8.Application;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by carolws on 12/02/17.
 */

public class Room8Application extends Application {
    @Override
    public void onCreate() {
        super.onCreate();


        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("myAppId")
                .server("http://localhost:1337/parse")
                .build()
        );
    }
}
