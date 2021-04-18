package org.mcnative.blocklab.process;

public interface Parameter {

    String getKey();

    Object get();

    <T> T getAs(Class<T> clazz);

    String getAsString();
}
