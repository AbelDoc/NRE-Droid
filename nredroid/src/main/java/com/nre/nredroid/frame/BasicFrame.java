package com.nre.nredroid.frame;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.nre.nredroid.R;

public class BasicFrame extends Frame {

    private TextView text;
    private int tmp = 0;

    @Override
    protected int getFrameLayout() {
        return R.layout.nre_frame_basic;
    }

    @Override
    protected void onCreateFrame(View inflated, boolean firstInflate, Bundle savedInstance) {
        if (firstInflate) {
            text = inflated.findViewById(R.id.nre_frame_basic_txt);
        }
        tmp++;
        text.setText("" + tmp);
    }
}
