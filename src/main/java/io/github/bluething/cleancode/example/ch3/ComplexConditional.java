package io.github.bluething.cleancode.example.ch3;

import java.time.LocalTime;

public class ComplexConditional {
    public static void main(String[] args){

        int hour = getHourOfDay();

        if(hour > 6 && hour < 22){
            System.out.println("Day time logic");

        } else {
            System.out.println("Night time logic");
        }
    }

    private static int getHourOfDay() {
        return LocalTime.now().getHour();
    }
}
