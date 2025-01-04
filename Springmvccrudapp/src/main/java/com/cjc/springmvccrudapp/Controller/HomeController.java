package com.cjc.springmvccrudapp.Controller;

	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;

	@Controller
	public class HomeController {
	@RequestMapping("/login")
	public String preLogin() {
	System.out.println("open first page");
	return "login";
	}
	}


