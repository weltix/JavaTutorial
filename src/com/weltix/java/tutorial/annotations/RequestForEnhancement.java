package com.weltix.java.tutorial.annotations; /**
 * Created by ASUS on 29.05.14.
 */
/**
 * Describes the Request-for-Enhancement (RFE) annotation type.
 */
public @interface RequestForEnhancement {
    int id();
    String synopsis();
    String engineer() default "[unassigned]";
    String date() default "[unknown]";
}