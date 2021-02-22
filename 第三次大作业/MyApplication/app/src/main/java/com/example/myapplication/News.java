package com.example.myapplication;

import java.io.Serializable;

public class News implements Serializable {
    private String name;
    private int imageId;
    private String time;
    private String from;
    private String text;

    public News(String name, String time, int imageId, String from, String text) {
        this.name = name;
        this.imageId = imageId;
        this.time = time;
        this.from = from;
        this.text = text;
    }

    public String getName() {
        return name;
    }
    public int getImageId() {
        return imageId;
    }
    public String getTimeA() {
        return time;
    }
    public String getFrom() {
        return from;
    }
    public String getText() {
        return text;
    }
}