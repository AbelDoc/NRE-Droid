package com.nre.nredroid.activity;

import android.os.Bundle;

import com.nre.nredroid.R;
import com.nre.nredroid.frame.FrameManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class NREActivity extends AppCompatActivity {

    private Toolbar toolBar;

    private FrameManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nre_act_main);
        setSupportActionBar(toolBar);

        toolBar = findViewById(R.id.nre_main_toolbar);
        manager = new FrameManager(getSupportFragmentManager(), R.id.nre_main_frame);
    }

    protected final Toolbar getToolBar() {
        return toolBar;
    }

    protected final FrameManager getManager() {
        return manager;
    }
}
