package study.validation.pan;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PanCardValidator implements ConstraintValidator<ValidPanCard, String> {

	private static final String PANCARD_PATTERN = "[A-Z]{5}[0-9]{4}[A-Z]";
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		if(value==null) {
			return false;
		}else if(value.matches(PANCARD_PATTERN)){
			return true;
		}
		return false;		
	}
}
