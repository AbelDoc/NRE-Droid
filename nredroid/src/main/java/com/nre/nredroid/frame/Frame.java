package com.nre.nredroid.frame;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public abstract class Frame extends Fragment {

    private Bundle internalBundle;

    public Frame() {
        internalBundle = new Bundle();
        internalBundle.putBoolean("firstInflate", true);
    }

    /**
     * Called on frame creation (or re-creation)
     * @param inflater   the view inflater
     * @param container  the parent container
     * @param nullBundle instance bundle, always null
     * @return the inflated view
     */
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle nullBundle) {
        View view = inflater.inflate(getFrameLayout(), container, false);

        boolean firstInflate = internalBundle.getBoolean("firstInflate", true);
        if (firstInflate) {
            internalBundle.putBoolean("firstInflate", false);
        }

        onCreateFrame(view, firstInflate, internalBundle);
        return view;
    }

    /**
     * @return the frame layout id
     */
    protected abstract int getFrameLayout();

    /**
     * Called on frame creation (or re-creation)
     * @param inflated      the inflated view
     * @param firstInflate  if this is the first layout inflate
     * @param savedInstance the saved instance bundle
     */
    protected abstract void onCreateFrame(View inflated, boolean firstInflate, Bundle savedInstance);

}
