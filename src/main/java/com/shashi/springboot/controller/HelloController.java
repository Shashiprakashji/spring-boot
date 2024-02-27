package com.shashi.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //map the request
//    @RequestMapping(value="/",method= RequestMethod.GET) //or we can write
    @GetMapping("/")
    public String helloWorld(){
        return "Hello world!";
    }
}
