package com.stano.scoretracker;

import android.app.Application;

import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;

/**
 * Created by STANO on 26/07/2014.
 */
public class App extends Application {

    private static Bus sBus;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public static Bus getBus() {
        if (sBus == null) {
            sBus = new Bus(ThreadEnforcer.ANY);
        }

        return sBus;
    }
}
