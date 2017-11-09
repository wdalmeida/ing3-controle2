package fr.esipe.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TryAgain {
    ArrayList<Class> arg = new ArrayList<>();
}
