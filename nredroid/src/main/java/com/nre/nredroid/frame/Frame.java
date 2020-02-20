package com.nre.nredroid.frame;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;

public abstract class Frame extends Fragment {

    /**
     * Called on frame creation (or re-creation)
     * @param inflater      the view inflater
     * @param container     the parent container
     * @param savedInstance the saved instance bundle
     * @return the inflated view
     */
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View view = inflater.inflate(getFrameLayout(), container, false);

        ButterKnife.bind(this, view);
        onCreateFrame(savedInstance);
        return view;
    }

    /**
     * @return the frame layout id
     */
    protected abstract int getFrameLayout();

    /**
     * Called on frame creation (or re-creation)
     * @param savedInstance the saved instance bundle
     */
    protected abstract void onCreateFrame(Bundle savedInstance);

}
