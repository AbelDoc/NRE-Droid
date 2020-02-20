package com.nre.nredroid_test;

import android.os.Bundle;

import com.nre.nredroid.activity.NREActivity;

public class NRE_Main extends NREActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getToolBar().setTitle("NRE Droid Test");
    }
}
