package com.home365.coredomain.entity.enums;

public enum LeaseType {
    Monthly("monthly"),
    Yearly("endOfTerm");

    private final String value;

    LeaseType(String value) {
        this.value = value;
    }

    public static LeaseType findByName(String type) {
        for(LeaseType value : values()){
            if(value.value.equals(type)){
                return value;
            }
        }
        return Monthly;
    }
}
