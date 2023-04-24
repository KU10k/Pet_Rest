package ru.rest.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckEmailValidate.class)
public @interface CheckEmail {

    public String message() default "email must ends with \"ya.ru\",\"mail.ru\",\"rambler.ru\"";

    public Class<?>[] groups() default {};
    public Class<? extends Payload>[] payload() default {};
}


