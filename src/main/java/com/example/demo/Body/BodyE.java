package com.example.demo.Body;

public enum BodyE {
    BACK1(10),
    BACK2(11),
    BACK3(12),
    BACK4(13),
    KNEE1(1),
    KNEE2(2),
    KNEE3(3),
    KNEE4(4),
    KNEE5(5),
    KNEE6(6),
    NEEK1(14),
    NEEK2(15),
    NEEK3(16),
    SHOULDER1(7),
    SHOULDER2(8),
    SHOULDER3(9);
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
