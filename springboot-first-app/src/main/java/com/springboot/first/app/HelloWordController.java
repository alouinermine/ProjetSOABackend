package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWordController {

	@GetMapping("/hello-world")
	public String helloWorld()
	{
		return "Hello World!";
	}

}
