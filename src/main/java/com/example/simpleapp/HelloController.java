package com.example.simpleapp;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {
    
    @RequestMapping("/welcome")
	public String welcomepage() {
		return "Welcome to my world";
	}
}
