package com.home365.coredomain.entity.enums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum BusinessType {
    Administrator(1),
    HomeWarranty(2),
    Vendor(3),
    PM(6),
    ServiceProvider(7),
    RealEstateOwner(8),
    ContactPerson(9),
    Tenant(10),
    ExternalAccount(21);

    public final int value;
    private static Map<Integer,BusinessType> map = new HashMap<>();



    public String getAuditName(){
        if(value == 8){
            return " Owner ";
        }
        if(value == 9){
            return " Contact ";
        }
        if(value == 7){
            return  " Service Pro ";
        }
        return this.name();
    }

    BusinessType(int label) {
        this.value = label;
    }

    public int getValue() {
        return value;
    }

    static {
        for (BusinessType pageType : BusinessType.values()) {
            map.put(pageType.value, pageType);
        }
    }

    public static BusinessType valueOf(int pageType) {
        return  map.get(pageType);
    }

    public static Optional<BusinessType> getBusiness(int val){
        return Arrays.stream(values())
                .filter(bus -> bus.value == val)
                .findFirst();
    }
}
