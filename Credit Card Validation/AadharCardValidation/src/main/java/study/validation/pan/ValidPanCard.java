package study.validation.pan;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = PanCardValidator.class)
@Retention(RUNTIME)
@Target({ FIELD, PARAMETER })
public @interface ValidPanCard {

	String message() default "Incorrect Pan Card Number";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
