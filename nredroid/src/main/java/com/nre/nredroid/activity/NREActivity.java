package com.nre.nredroid.activity;

import android.os.Bundle;

import com.nre.nredroid.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class NREActivity extends AppCompatActivity {

    private Toolbar toolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nre_act_main);
        setSupportActionBar(toolBar);

        toolBar = findViewById(R.id.nre_main_toolbar);
    }

    protected final Toolbar getToolBar() {
        return toolBar;
    }
}
