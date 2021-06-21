package com.home365.coredomain.entity.enums;

import org.springframework.util.ObjectUtils;

import java.util.HashMap;
import java.util.Map;

public enum PaymentMethod {
    noPaymentMethod(0),

    transfer(2),
    check(5),
    other(6),
    securityDeposit(80);


    private final int value;
    private static Map map = new HashMap<>();

    PaymentMethod(int value) {
        this.value = value;

    }

    public int getValue() {
        return value;
    }

    static {
        for (PaymentMethod pageType : PaymentMethod.values()) {
            map.put(pageType.value, pageType);
        }
    }

    public static PaymentMethod valueOf(int pageType) {
        return (PaymentMethod) map.get(pageType);
    }


    public static String getBusinessValue(Integer value){
        String result = null;
        PaymentMethod paymentMethod = valueOf(value);
        if(paymentMethod != null){
            if(noPaymentMethod.equals(paymentMethod)){
                result = "No payment method";
            }
            if(securityDeposit.equals(paymentMethod)){
                result = " security deposit";
            }
            if(ObjectUtils.isEmpty(result)){
                result = paymentMethod.name();
            }
        }
        return result;
    }

}
