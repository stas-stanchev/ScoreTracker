package com.stano.scoretracker.ui;

import android.app.Activity;

import butterknife.ButterKnife;

public class BaseActivity extends Activity {

    @Override
    public void onContentChanged() {
        super.onContentChanged();
        ButterKnife.inject(this);
    }
}
