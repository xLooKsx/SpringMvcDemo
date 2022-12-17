package br.pessoal.springDemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloWorld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloWorld";
	}
	
	@RequestMapping("/processFormV2")
	public String processFormV2(HttpServletRequest request, Model model) {
		
		
		String studentName = request.getParameter("studentName").toUpperCase();
		model.addAttribute("studentName", "Yo! "+studentName);
		
		return "helloWorld";
	}
	
	@RequestMapping("/processFormV3")
	/**
	 * If my variable using @RequestParam have the same name that is used in httpRequest parameter I don't need to pass the parameter name like
	 * @RequestParam("foo")
	 * */
	public String processFormV3(@RequestParam String studentName, Model model) {
		
		
	
		model.addAttribute("studentName", "Hey My friend from v3! "+studentName.toUpperCase());
		
		return "helloWorld";
	}
}
