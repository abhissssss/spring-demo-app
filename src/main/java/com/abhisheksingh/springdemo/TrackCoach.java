package com.abhisheksingh.springdemo;

import com.abhisheksingh.springdemo.Coach;

public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }
}
