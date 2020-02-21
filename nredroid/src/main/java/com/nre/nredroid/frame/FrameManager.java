package com.nre.nredroid.frame;

import android.util.SparseArray;

import com.nre.nredroid.exception.FrameConstructionException;

import java.util.Stack;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class FrameManager {

    private FragmentManager internalManager;

    private int frameLayout;
    private SparseArray<Frame> frames;
    private Stack<Integer> framesId;



    public FrameManager(FragmentManager manager, int id) {
        internalManager = manager;
        frameLayout = id;
        frames = new SparseArray<>();
        framesId = new Stack<>();
    }

    public void showFrame(Class<? extends Frame> frame) throws FrameConstructionException {
        int hash = frame.hashCode();
        if (frames.get(hash) == null) {
            try {
                frames.put(hash, FrameBuilder.createFrame(frame));
            } catch (Exception e) {
                throw new FrameConstructionException(e.getMessage());
            }
        }
        changeFrame(frames.get(hash), hash);
    }

    private void changeFrame(Frame f, int frameHash) {
        if (!f.isVisible()) {
            FragmentTransaction replace = internalManager.beginTransaction().replace(frameLayout, f, Integer.toString(frameHash));
            if (!framesId.empty()) {
                replace.addToBackStack(null);
            }
            framesId.push(frameHash);
            replace.commit();
        }
    }

    public void popFrame() {
        if (framesId.size() > 1) {
            framesId.pop();
        }
    }

}
