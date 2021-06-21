package com.home365.coredomain.entity.enums;

import java.util.Arrays;
import java.util.Optional;

public enum PropertyType {
        Unknown(1),
        SingleFamily(2),
        Duplex(3),
        Triplex (4),
        Quadruplex(5),
        Condominium(6),
        Cooperative (7),
        Mobile (8),
        MultiFamily2To4 (9),
        MultiFamily5Plus(10),
        Timeshare (11),
        Miscellaneous (12),
        VacantResidentialLand (13);

    public final int value;
    PropertyType(int label) {
        this.value = label;
    }

    public static Optional<PropertyType> getPropertyType(int val){
        return Arrays.stream(values())
                .filter(bus -> bus.value == val)
                .findFirst();
    }
}
