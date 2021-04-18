package org.mcnative.blocklab.process.definition;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface Parameter {

    String name();

    Class<?> type();

    boolean required() default true;

    boolean dynamic() default false;
}
