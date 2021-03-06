package com.nre.nredroid_test;

import android.os.Bundle;

import com.nre.nredroid.activity.NREActivity;
import com.nre.nredroid.exception.FrameConstructionException;
import com.nre.nredroid.frame.BasicFrame;

public class NRE_Main extends NREActivity {

    @Override
    protected void NREonCreate(boolean firstInflate, Bundle savedInstanceState) {
        if (firstInflate) {
            getToolBar().setTitle("NRE Droid Test");
            try {
                getManager().showFrame(BasicFrame.class);
            } catch (FrameConstructionException e) {
                e.printStackTrace();
            }
        }
    }
}
