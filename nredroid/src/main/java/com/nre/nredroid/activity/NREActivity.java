package com.nre.nredroid.activity;

import android.os.Bundle;

import com.nre.nredroid.R;
import com.nre.nredroid.frame.FrameManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

public class NREActivity extends AppCompatActivity {

    private Toolbar toolBar;
    private DrawerLayout drawer;

    private FrameManager manager;
    private Bundle internalBundle;

    public NREActivity() {
        internalBundle = new Bundle();
        internalBundle.putBoolean("firstInflate", true);
    }

    @Override
    protected void onCreate(Bundle nullBundle) {
        super.onCreate(internalBundle);
        setContentView(R.layout.nre_act_main);
        setSupportActionBar(toolBar);

        boolean firstInflate = internalBundle.getBoolean("firstInflate");
        if (firstInflate) {
            internalBundle.putBoolean("firstInflate", false);

            toolBar = findViewById(R.id.nre_main_toolbar);
            drawer = findViewById(R.id.nre_main_drawer);

            manager = new FrameManager(getSupportFragmentManager(), R.id.nre_main_frame);
        }

        NREonCreate(firstInflate, internalBundle);
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            manager.popFrame();
            super.onBackPressed();
        }
    }

    protected final Toolbar getToolBar() {
        return toolBar;
    }

    protected final FrameManager getManager() {
        return manager;
    }

    protected void NREonCreate(boolean firstInflate, Bundle savedInstanceState) {
    }
}
