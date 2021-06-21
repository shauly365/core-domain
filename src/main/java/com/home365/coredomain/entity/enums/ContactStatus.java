package com.home365.coredomain.entity.enums;

public enum ContactStatus {
    Active(0),
    NotActive(1);

    public final int value;

    ContactStatus(int label) {
        this.value = label;
    }

    public int getValue() {
        return value;
    }
}
