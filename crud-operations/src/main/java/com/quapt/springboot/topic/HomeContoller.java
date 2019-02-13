package com.quapt.springboot.topic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeContoller {

	@RequestMapping("/home")
	public String home() {
	System.out.println("hi this is home page 4uu-->");
		return "home.jsp";
	}
}
