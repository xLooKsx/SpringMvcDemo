package br.pessoal.springDemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


//This annotation represent witch class is responsible for implementation
@Constraint(validatedBy = CourseConstraintValidator.class)

//This annotation says where I can use that annotation
@Target({ElementType.METHOD, ElementType.FIELD})

//It's going to be recorded in the class file by the compiler and retained by the VM at run time, so they may be read reflectively
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	
	//If I don't specify a value when I use my @CourseCode annotation those params they will be have those default values
	
	//define default course code
	public String value() default "CRS";
	
	//define default error message
	public String message() default "Must Start with CRS";
	
	//define default groups
	public Class<?>[] groups() default {};
	
	//define default payloads
	public Class<? extends Payload>[] payload() default {};

}
