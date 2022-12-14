package br.pessoal.springDemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import br.pessoal.springDemo.mvc.validation.CourseCode;

public class Customer {
	
	private String firstName;
		
	@NotNull(message = "cant be null")
	@Size(min = 3, message = "too short")
	private String lastName;
	
	@NotNull(message = "cant be null")
	@Min(value = 0, message = "must be greater than 0 or equal to zero")
	@Max(value = 10, message = "must be less than or equal to ten")
	private Integer freePasses;
	
	@Pattern(regexp = "^[a-zA-z0-9]{5}", message = "only 5 chars/digits")
	private String postalCode;
	
	//All those params and default values was defined in @interface class
	@CourseCode(value = "CRS", message = "It's necessary to have CRS prefix to be a valid course")
	private String courseCode;
	
		
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
