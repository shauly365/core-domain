package com.home365.coredomain.entity;

import com.home365.coredomain.entity.enums.EntityType;
import com.home365.coredomain.entity.enums.TenantStatus;
import com.home365.coredomain.entity.enums.TransferTo;
import com.home365.coredomain.entity.inter.IAuditableEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "`AccountExtensionBase`")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountExtensionBase implements IAuditableEntity, Serializable {

    @Id
    @Column(name = "AccountId")
    @AuditInfo(ignore = true)
    private String accountId;

    @Column(name = "New_BusinessType")
    @AuditInfo(ignore = true)
    private Integer businessType;

    @Column(name = "New_status")
    @AuditInfo(ignore = true)
    private Integer accountStatus;

    @Column(name = "New_StripeApiKey")
    @AuditInfo(ignore = true)
    private String stripeApiKey;

    @Column(name = "new_managerid")
    @AuditInfo(ignore = true)
    private String newManagerId;

    @Column(name = "New_StripeRentAccountId")
    @AuditInfo(ignore = true)
    private String stripeRentAccount;

    @Column(name = "New_StripeRentCustomerId")
    @AuditInfo(ignore = true)
    private String stripeCustomerAccount;

    @Column(name = "New_StripeAccountId")
    @AuditInfo(ignore = true)
    private String stripeAccountId;

    @Column(name = "New_StripeCustomerId")
    @AuditInfo(ignore = true)
    private String stripeCustomerId;


    @Column(name = "New_FullName")
    @AuditInfo(ignore = true)
    private String fullName;

    @Column(name = "StripeCustomerPayment")
    private String stripeCustomerPayment;


    @Column(name = "New_FullAddress")
    private String address;

    @Column(name = "New_AccountType")
    @Enumerated(value = EnumType.STRING)
    private TransferTo accountType;

    @Column(name = "New_PlaidClientId")
    private String plaidClientId;

    @Column(name = "New_PlaidSecret")
    private String plaidSecretKey;

    @Enumerated(EnumType.STRING)
    @Column(name = "tenant_status")
    @AuditInfo(ignore = true)
    TenantStatus tenantStatus;

    @Column(name = "new_countryid")
    @AuditInfo(ignore = true)
    private String countryId;

    @Column(name = "New_EIN")
    private String ein;

    @Column(name = "New_SocialSecurityNumber")
    private String ssn;

    @Column(name = "New_PayeeMethod")
    private Integer payeeMethod;

    @Column
    private String unit;

    @Column
    private String building;

    @Column
    private String street;

    @Column
    private Integer paymentMethod;

    @Column
    private String routingNumber;

    @Column
    private String cardNumber;

    @Column(name = "New_PostalCode")
    private String zipCode;

    @Column(name = "New_City")
    private String city;

    @Column(name = "New_StateProvince")
    private String state;

    @Column(name = "New_Country")
    private String country;

    @Column
    private String fullAddress;

    @Column
    private Integer companyType;

    @Column(name = "New_DateOfBirth")
    private Date birthDay;

    @Column
    private String einDescription;

    @Column
    @AuditInfo(ignore = true)
    private String contactCompanyId;

    @Column(name = "categoryId")
    @AuditInfo(viewName = " Category ")
    private String categoryId;

    @Column(name = "typeId")
    @AuditInfo(ignore = true)
    private String typeId;

    @Column(name = "New_AddressLine1")
    private String address1;

    @Column(name = "New_AddressLine2")
    private String address2;

    @Column(name = "ownerStatus")
    private String ownerStatus;

    @Column(name = "CheckeeperSign")
    private String CheckeeperSign;

    @Column(name = "New_RentBankAccount")
    private String bankAccount;

    @Column(name = "New_RentBankRoutingNumber")
    private String bankRoutingNumber;

    @Column(name = "New_IsTest")
    private Boolean isTest;

    @Column(name = "StripeExternalConnectedAccountId")
    private String stripeExternalAccount;

    @Override
    public EntityType auditEntityType() {
        return EntityType.AccountBase;
    }

    @Override
    public String auditEntityIdentifier() {
        return this.accountId;
    }

    @Override
    public String auditMessage() {
        return null;
    }

    @Override
    public String idOfEntity() {
        return this.accountId;
    }


}
