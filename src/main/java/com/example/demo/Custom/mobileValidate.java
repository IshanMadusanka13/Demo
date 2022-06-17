package com.example.demo.Custom;

import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MobileValidater.class)
public @interface mobileValidate {
public String errormsg() default "Invalid Mobile Number";
}
