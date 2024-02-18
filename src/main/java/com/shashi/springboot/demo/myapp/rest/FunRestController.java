package com.shashi.springboot.demo.myapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

//    inject property for coach.name and team.name
    @Value("${coach.name}")
        private String coachName;
    @Value("${team.name}")
        private String teamName;

    //now use the endpoints for teaminfo
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach: "+coachName+" Team: "+teamName;
    }

    @GetMapping("/")
    public String sayHello(){
        return "Hello Guys my new project";
    }
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run Guys!";
    }


}
