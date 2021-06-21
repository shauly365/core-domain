package com.home365.coredomain.entity.enums;

import java.util.HashMap;
import java.util.Map;

public enum AccountStatus {
    Approved(1),
    Candidate(2),
    Inactive(3),
    Trial(4),
    Rarah(5),
    Registration(6),
    Administrator(7);
    public final int value;
    private static Map map = new HashMap<>();


    AccountStatus(int label) {
        this.value = label;
    }

    public int getValue() {
        return value;
    }


    static {
        for (AccountStatus pageType : AccountStatus.values()) {
            map.put(pageType.value, pageType);
        }
    }

    public static AccountStatus valueOf(int pageType) {
        return (AccountStatus) map.get(pageType);
    }
}
