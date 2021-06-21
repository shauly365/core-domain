package com.home365.coredomain.entity.projection;


public interface IAccountsPayTo {
    String getName();

    Integer getPayeeMethod();

    String getId();

    Boolean getHasDiscountCapability();

    Integer getBusinessType();

    String getAddress();

    String getCategoryId();

    String getTypeId();

    String getTenantStatus();


}
