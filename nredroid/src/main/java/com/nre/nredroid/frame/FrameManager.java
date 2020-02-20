package com.nre.nredroid.frame;

import android.util.SparseArray;

import java.util.Stack;

import androidx.core.util.Pair;

public class FrameManager {

    int frameLayout;

    private SparseArray<Frame> frames;
    private Stack<Pair<Integer, Integer>> framesId;


    public FrameManager(int id) {
        frameLayout = id;
        frames = new SparseArray<>();
        framesId = new Stack<>();
    }

}
