package com.home365.coredomain.entity.enums;

public enum OwnerStatus {

    Active("Active"),
    OnBoarding("OnBoarding"),
    WaitingForManagement("WaitingForManagement"),
    Inactive("Inactive");

    public final String value;

    OwnerStatus(String label) {
        this.value = label;
    }

    public String getValue() {
        return value;
    }

    }
