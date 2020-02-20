package com.nre.nredroid.frame;

import java.lang.reflect.InvocationTargetException;

class FrameBuilder {

    static Frame createFrame(Class<? extends Frame> name) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        return name.getConstructor().newInstance();
    }
}
