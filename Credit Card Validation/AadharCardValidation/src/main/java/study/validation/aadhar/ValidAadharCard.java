package study.validation.aadhar;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;


@Constraint(validatedBy = AadharCardValidator.class)
@Retention(RUNTIME)
@Target({ FIELD, PARAMETER })
public @interface ValidAadharCard {

	String message() default "Invalid Aadhar Number; it must be exactly 12 digits";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
