package org.mcnative.blocklab.process;

import java.util.Map;

public interface Context {

    Map<String, Object> getOutputs();

    void fireOutput(Object object);

    default void next() {
        next(0);
    }

    void next(int index);


    Parameter getParameter(String key);

    Parameter[] getParameters();
}
