package com.example.demo;

public enum BodyE {
    KNEE1(1),
    KNEE2(2),
    KNEE3(3),
    NEEK1(4),
    NEEK2(5),
    SHOULDER1(6),
    SHOULDER2(7);
 private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    BodyE(int id) {
        this.id = id;
    }
}
