package com.home365.coredomain.entity.enums;

public enum TenantType {
    longTerm("longTerm"), sec8("section8");
    private final String value;

    TenantType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String getBusinessName(){
        if(this.equals(longTerm)){
            return "Long term";
        }
        if(this.equals(sec8)){
            return "Section 8 - Long term";
        }
        return this.name();
    }
}


