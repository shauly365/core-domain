package com.home365.coredomain.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "`New_countryExtensionBase`")
public class CountryExtensionBase {
    @Id
    @Column(name = "New_countryId")
    private String countryId;

    @Column(name = "New_Alpha2")
    private String countryCodeName;

    @Column(name = "New_DialCode")
    private String dialCode;

    @Column(name = "New_name")
    private String countryName;
}
