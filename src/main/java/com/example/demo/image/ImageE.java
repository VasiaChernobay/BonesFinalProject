package com.example.demo.image;

public enum  ImageE {
    NECK(3),
    KNEE(2),
    SHOULDER(4),
    BACK(1);
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
