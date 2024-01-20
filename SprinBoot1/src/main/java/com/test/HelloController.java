package com.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{
	@GetMapping("/hello")
	public String hai()
	{
		return "Hello SoringBoot";
	}

}
