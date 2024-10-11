package com.bhim.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	
	@GetMapping("/greet")
	public String greeMsg() {
		return " good Morning";
		}
}
