package core_java_udemy.reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.METHOD)
public @interface MyAnnotation {
    public String value1();
    public String value2();
}
