package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Controller inherits @Component
 * So @Controller gets picked up during @ComponentScan	
 * @author user
 *
 */
@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showPage() {
		return "main-menu" ;  // The prefix and suffix will beadded automatically by Spring as defined in Spring Config XML.
	}
}
