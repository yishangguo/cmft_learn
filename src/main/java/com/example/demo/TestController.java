package com.example.demo;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	/**
     * 本地访问内容地址 ：http://localhost:8080/hello
     * @param 
     * @return
     */
    @RequestMapping("/hello")
    public String index() {
        
        return "/index";
    }
    
    @RequestMapping("/hello2")
    public String index2() {
        
        return "/index2";
    }
    
    
}
