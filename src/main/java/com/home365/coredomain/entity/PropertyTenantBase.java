package com.home365.coredomain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "`New_property_tenantBase`")
public class PropertyTenantBase {
    @Id
    @Column(name = "New_property_tenantId")
    private String propertyTenantId;

    @Column(name = "CreatedBy")
    private String CreatedBy;

//    @Column(name = "CreatedOn")
//    private Date CreatedOn;

    @Column(name = "DeletionStateCode")
    private int DeletionStateCode;

    @Column(name = "ImportSequenceNumber")
    private int ImportSequenceNumber;

    @Column(name = "ModifiedBy")
    private String ModifiedBy;

//    @Column(name = "ModifiedOn")
//    private Date ModifiedOn;

//    @Column(name = "OverriddenCreatedOn")
//    private Date OverriddenCreatedOn;

    @Column(name = "statecode")
    private int statecode;

    @Column(name = "statuscode")
    private int statuscode;

//    @Column(name = "OwningUser")
//    private Date OwningUser;
}
