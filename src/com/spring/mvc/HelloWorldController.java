package com.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "name-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "result-page";
	}
	
	/**
	 * We can add any no. of parameters to this method. 
	 * Model is a class of springframework UI package.
	 * - We can also define @RequestMapping on the controller level.
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping("processFormUppercase")
	public String processFormUppercase(HttpServletRequest request, Model model) {
		
		/**
		 * We can add any no. of attributes(or data) to the model
		 */
		model.addAttribute("uName", request.getParameter("name").toUpperCase());
		return "result-page" ;
	}
	
	@RequestMapping("processFormVersion2")
	public String processFormVersion2(@RequestParam("theName") String name, Model model) {
		model.addAttribute("theName", name.toUpperCase());
		return "result-page";
	}
}
