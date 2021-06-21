package com.home365.coredomain.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Rules implements Serializable {
    private String days_to_create_recurring;
    private Double bankFee;
    private Double creditFee;
    private Long reversePaymentFine;
    private String leaseFeeMethod;

}
