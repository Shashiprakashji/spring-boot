package com.shashi.springboot.demo.myapp;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Lets all daily workout";
    }
}
