package com.vitalii;

import java.util.ArrayList;

public class Run {

    public static void main(String[] args) {

        int minute = 11;

        ArrayList<Light> trafficLights = new ArrayList<>();

        trafficLights.add(new Light("green", 3));
        trafficLights.add(new Light("yellow", 1));
        trafficLights.add(new Light("red", 1));

        int cycle = 0;

        for (Light trafficLight : trafficLights) {
            cycle += trafficLight.getTime();
        }

        int res = minute % cycle;

        if (res == 0 && minute > 0) {
            System.out.println("Color: " + trafficLights.get(2).getLight());
            return;
        }

        int index = 0;

        for (int i = 0; i < trafficLights.size(); i++) {
            res -= trafficLights.get(i).getTime();

            if (res <= 0) {
                index = i;
                break;
            }
        }

        System.out.println("Color: " + trafficLights.get(index).getLight());
    }
}
