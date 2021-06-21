package com.home365.coredomain.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
@Table(name = "`New_accountexpertiseBase`")
public class AccountExpertise {
    @Column(name = "CreatedBy")
    private String createdBy;
    @Column(name = "DeletionStateCode")
    private Integer deletionStateCode;
    @Id
    @Column(name = "New_accountexpertiseId",updatable = false,insertable = false)
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String newAccountexpertiseId;
    @Column(name = "statecode")
    private Integer statecode;
    @Column(name = "statuscode")
    private Integer statuscode;
}
