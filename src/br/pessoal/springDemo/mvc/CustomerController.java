package br.pessoal.springDemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//add an initbinder to convert trim input Strings remove leading
	//and trailing whitespace resolve issue for validation
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		model.addAttribute("customer", new Customer());
		return "customerForm";
	}
	
	@RequestMapping("processForm")
	public String processForm(@Valid @ModelAttribute Customer customer,
			BindingResult bindingResult) {
		
		System.out.println("customer Last Name: |"+customer.getLastName()+"|");
		
		System.out.println("Binding result: "+ bindingResult);
		
		return bindingResult.hasErrors() ? "customerForm" : "customerConfirmation";
	}
}
