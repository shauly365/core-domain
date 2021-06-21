package com.home365.coredomain.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "`New_propertyaccountExtensionBase`")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PropertyAccountExtension {

    @Id
    @Column(name = "New_propertyaccountId")
    private String propertyAccountId;
    @Column(name = "New_AccountId")
    private String accountId;
    @Column(name = "New_PropertyId")
    private String propertyId;
    @Column(name = "New_IsActive")
    private Boolean active;
}
