package com.home365.coredomain.wrapper;

import com.home365.coredomain.entity.AuditInfo;
import lombok.Data;

@Data
public class ForwardingAddress {
    @AuditInfo(viewName = "Forwarding address")
    String address;
    @AuditInfo(viewName = "Forwarding city")
    String city;
    @AuditInfo(viewName = "Forwarding state")
    String state;
    @AuditInfo(viewName = "Forwarding unit")
    String unit;
    @AuditInfo(viewName = "Forwarding zipCode")
    String zipCode;
    @AuditInfo(viewName = "Forwarding country")
    String country;
}
