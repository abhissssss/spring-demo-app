package com.abhisheksingh.springdemo;

public class SwimmingCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "20 Push ups";
    }

    @Override
    public String getDailyDrill() {
        return "2 Laps Each 3 minutes in the pool";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
