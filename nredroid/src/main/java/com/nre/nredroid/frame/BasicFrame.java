package com.nre.nredroid.frame;

import android.os.Bundle;

import com.nre.nredroid.R;

public class BasicFrame extends Frame {
    @Override
    protected int getFrameLayout() {
        return R.layout.nre_frame_basic;
    }

    @Override
    protected void onCreateFrame(Bundle savedInstance) {
    }
}
