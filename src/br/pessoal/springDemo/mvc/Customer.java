package br.pessoal.springDemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {
	
	private String firstName;
		
	@NotNull(message = "cant be null")
	@Size(min = 3, message = "too short")
	private String lastName;
	
	@Min(value = 0, message = "must be greater than 0 or equal to zero")
	@Max(value = 10, message = "must be less than or equal to ten")
	private int freePasses;
	
	
	
	public int getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(int freePasses) {
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
