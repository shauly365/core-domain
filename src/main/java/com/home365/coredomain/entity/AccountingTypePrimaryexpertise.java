package com.home365.coredomain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "`AccountingTypePrimaryexpertise`")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountingTypePrimaryexpertise {
    @Id
    @Column(insertable = false, updatable = false)
    private String id;
    @Column(insertable = false, updatable = false)
    private String transferTo;
    @Column(insertable = false, updatable = false)
    private String new_primaryexpertiseExtensionBaseId;
    @Column(insertable = false, updatable = false)
    private Boolean hideFromPortal;
}
