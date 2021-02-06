package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/hello", method = RequestMethod.GET)
public class HelloController {

	@RequestMapping(value = "/init")
	public String index(Model model) {
		model.addAttribute("message", "Hello World!!");
		return "index";
	}
}
