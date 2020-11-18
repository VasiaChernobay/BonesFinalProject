package com.example.demo;

public enum  ImageE {
    NECK(1),
    KNEE(4),
    SHOULDER(3),
    BACK(2);
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    ImageE(int id) {
        this.id = id;
    }
}
