package org.mcnative.blocklab.process.definition;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface Definition {

    String name();

    Class<?> outputType() default Void.class;

    Next next() default @Next;

    Parameter[] parameters();
}
