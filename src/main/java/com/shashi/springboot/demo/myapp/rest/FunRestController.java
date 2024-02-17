package com.shashi.springboot.demo.myapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello Guys my new project";
    }
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run Guys!";
    }


}
