package br.pessoal.springDemo.mvc.validation;

import java.util.Objects;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseConstraintValidator implements ConstraintValidator<CourseCode, String>{

	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode constraintAnnotation) {
		coursePrefix = constraintAnnotation.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext validatorContext) {
		
		//Checks if 'theCode' is null, if it's null returns false and if it's not checks the prefix
		return Objects.isNull(theCode) ? false : theCode.startsWith(coursePrefix);
	}
}
