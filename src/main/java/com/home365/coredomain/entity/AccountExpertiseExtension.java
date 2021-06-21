package com.home365.coredomain.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "`New_accountexpertiseExtensionBase`")
public class AccountExpertiseExtension {
    private String accountexpertiseId;
    private String accountNumber;
    private Boolean certificate = false;
    private BigDecimal considerasPrice;
    private String externalCode;
    private String incidentPrice;
    private String incidentpriceBase;
    private Boolean incidentPriceChangeable = true;
    private Boolean isdirectunavailabilitychange = false;
    private Boolean exclusive = false;
    private String name;
    private Timestamp unavailablefrom;
    private Timestamp newUnavailableto;
    private String accountId;
    private String categoryId;

    @Column(name = "new_accountid")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Column(name = "new_primaryexpertiseid")
    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    @Id
    @Column(name = "New_accountexpertiseId")
    public String getAccountexpertiseId() {
        return accountexpertiseId;
    }

    public void setAccountexpertiseId(String newAccountexpertiseId) {
        this.accountexpertiseId = newAccountexpertiseId;
    }

    @Basic
    @Column(name = "New_accountnumber")
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String newAccountnumber) {
        this.accountNumber = newAccountnumber;
    }

    @Basic
    @Column(name = "New_certificate")
    public Boolean getCertificate() {
        return certificate;
    }

    public void setCertificate(Boolean newCertificate) {
        this.certificate = newCertificate;
    }

    @Basic
    @Column(name = "New_considerasprice")
    public BigDecimal getConsiderasPrice() {
        return considerasPrice;
    }

    public void setConsiderasPrice(BigDecimal newConsiderasprice) {
        this.considerasPrice = newConsiderasprice;
    }

    @Basic
    @Column(name = "New_ExternalCode")
    public String getExternalCode() {
        return externalCode;
    }

    public void setExternalCode(String newExternalCode) {
        this.externalCode = newExternalCode;
    }

    @Basic
    @Column(name = "New_IncidentPrice")
    public String getIncidentPrice() {
        return incidentPrice;
    }

    public void setIncidentPrice(String newIncidentPrice) {
        this.incidentPrice = newIncidentPrice;
    }

    @Basic
    @Column(name = "new_incidentprice_Base")
    public String getIncidentpriceBase() {
        return incidentpriceBase;
    }

    public void setIncidentpriceBase(String newIncidentpriceBase) {
        this.incidentpriceBase = newIncidentpriceBase;
    }

    @Basic
    @Column(name = "New_IncidentPriceChangeable")
    public Boolean getIncidentPriceChangeable() {
        return incidentPriceChangeable;
    }

    public void setIncidentPriceChangeable(Boolean newIncidentPriceChangeable) {
        this.incidentPriceChangeable = newIncidentPriceChangeable;
    }

    @Basic
    @Column(name = "New_isdirectunavailabilitychange")
    public Boolean getIsdirectunavailabilitychange() {
        return isdirectunavailabilitychange;
    }

    public void setIsdirectunavailabilitychange(Boolean newIsdirectunavailabilitychange) {
        this.isdirectunavailabilitychange = newIsdirectunavailabilitychange;
    }

    @Basic
    @Column(name = "New_IsExclusive")
    public Boolean getExclusive() {
        return exclusive;
    }

    public void setExclusive(Boolean newIsExclusive) {
        this.exclusive = newIsExclusive;
    }

    @Basic
    @Column(name = "New_name")
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    @Basic
    @Column(name = "New_unavailablefrom")
    public Timestamp getUnavailablefrom() {
        return unavailablefrom;
    }

    public void setUnavailablefrom(Timestamp newUnavailablefrom) {
        this.unavailablefrom = newUnavailablefrom;
    }

    @Basic
    @Column(name = "New_unavailableto")
    public Timestamp getNewUnavailableto() {
        return newUnavailableto;
    }

    public void setNewUnavailableto(Timestamp newUnavailableto) {
        this.newUnavailableto = newUnavailableto;
    }


}
