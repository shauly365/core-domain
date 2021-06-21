package com.home365.coredomain.entity.enums;

public enum UserType {
    OWNER(1),
    ADMINISTRATOR(2),
    TEAMMATE(3),
    CONTACT(9);

    public final int value;

    UserType(int label) {
        this.value = label;
    }

    public int getValue() {
        return value;
    }
}
