package com.home365.coredomain.entity.projection;

import java.util.Date;

public interface ICompanyAndOwnersProjection {
    String getAccountId();
    String getContactId();
    String getName();
    String getEin();
    String getSsn();
    String getStreet();
    String getUnit();
    String getBuilding();
    Integer getPaymentMethod();
    String getRoutingNumber();
    String getCardNumber();
    String getZipCode();
    String getEmail();
    String getFirstName();
    String getLastName();
    String getPhone();
    String getCountryName();
    String getIso();
    String getPhonePrefix();
    String getFormattedPhone();
    String getCity();
    String getState();
    String getCountry();
    String getFullAddress();
    Integer getCompanyType();
    Boolean getPrimaryContact();
    Date getBirthDay();
    String getEinDescription();
}
