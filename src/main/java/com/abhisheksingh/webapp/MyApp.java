package com.abhisheksingh.webapp;
import com.abhisheksingh.springdemo.Coach;
import com.abhisheksingh.springdemo.TrackCoach;

public class MyApp {
    public static void main(String[] args) {
        // create the object
        Coach theCoach = new TrackCoach();
        // use the object
        System.out.println(theCoach.getDailyWorkout());
    }
}
