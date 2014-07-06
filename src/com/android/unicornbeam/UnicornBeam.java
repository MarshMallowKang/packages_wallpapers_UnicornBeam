package com.android.unicornbeam;

import android.app.Activity;
import android.os.Bundle;

public class UnicornBeam extends Activity {

    private UnicornBeamView mView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mView = new UnicornBeamView(this);
        setContentView(mView);
    }
}
