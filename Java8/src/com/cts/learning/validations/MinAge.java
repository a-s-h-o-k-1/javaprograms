package com.cts.learning.validations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.TYPE})
public @interface MinAge {
    String message() default  "age is must be greather than 18";
    Class<?>[] groups() default {};
    Class<?>[]  payload() default{};
}
