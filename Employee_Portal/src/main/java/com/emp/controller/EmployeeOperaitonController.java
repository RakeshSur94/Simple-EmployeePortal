package com.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeOperaitonController {
	
	@GetMapping("/")
	public String showHomePage() {
		return "home";
	}

}
