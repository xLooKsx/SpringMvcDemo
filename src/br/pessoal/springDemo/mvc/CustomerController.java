package br.pessoal.springDemo.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		model.addAttribute("customer", new Customer());
		return "customerForm";
	}
	
	@RequestMapping("processForm")
	public String processForm(@Valid @ModelAttribute Customer customer,
			BindingResult bindingResult) {
		
		System.out.println("customer Last Name: |"+customer.getLastName()+"|");
		return bindingResult.hasErrors() ? "customerForm" : "customerConfirmation";
	}
}
