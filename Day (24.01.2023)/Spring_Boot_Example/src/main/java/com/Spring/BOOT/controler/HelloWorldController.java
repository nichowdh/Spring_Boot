package com.Spring.BOOT.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@RequestMapping("/hello") // rest API
	public String display() {
		return "Hello .... My First spring Boot Example";
	}

}
