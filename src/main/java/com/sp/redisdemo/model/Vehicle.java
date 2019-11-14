package com.sp.redisdemo.model;

import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;


@RedisHash(value = "Student", timeToLive = 3000L)
public final class Vehicle implements Serializable {


    private String id;
    private String model;
    private String color;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "I am " + model + " with color " + color + " ";
    }
}
