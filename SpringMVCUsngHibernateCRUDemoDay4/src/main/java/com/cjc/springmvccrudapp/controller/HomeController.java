package com.cjc.springmvccrudapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
public String preLogin() {
		System.out.println("Open First Page");
	return "login";
}	
}
	@RequestMapping("/openRegisterPage")
	public String preLogin1() {
		return "register";
		
	}
}
