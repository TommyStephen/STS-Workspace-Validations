package study.validation.aadhar;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AadharCardValidator implements ConstraintValidator<ValidAadharCard, String> {

	//Regex to validate
	private static final String AADHAR_PATTERN = "^\\d{12}$";
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(value==null) {
			return false;
		}else if(value.matches(AADHAR_PATTERN)){
			return true;
		}
		return false;
	}

}
