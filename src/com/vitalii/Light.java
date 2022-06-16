package com.vitalii;

public class Light {

    private final String light;
    private final int time;

    public Light(String light, int time) {
        this.light = light;
        this.time = time;
    }

    public String getLight() {
        return light;
    }

    public int getTime() {
        return time;
    }
}
