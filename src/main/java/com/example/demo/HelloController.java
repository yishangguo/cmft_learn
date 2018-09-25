package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
//	test restfull
	@RequestMapping("/data/{data}")
	public String testData(@PathVariable String data) {
		System.out.println("data:"+data);
		return data;
	}
	
	
	 @RequestMapping("/")
	    public String hello(){
	        return "Welcome to start SpringBoot!";
	    }
	 
	 @RequestMapping("/testHello")
	    public boolean testHello(Name name) {
	        System.out.println(name);
			return true;
	    }
	 
	 @RequestMapping("/testHello2")
	    public boolean testHello2(Name name) {
	        System.out.println("testHello2:::::"+name);
			return true;
	    }
}
