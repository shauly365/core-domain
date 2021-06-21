package com.home365.coredomain.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "`New_PropertyPlanRecordExtensionBase`")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PropertyPlanRecordExtension {
    @Id
    @Column(name = "New_propertyplanrecordId")
    String id;

    @Column(name = "New_PropertyPlanId")
    String propertyPlanId;

    @Column(name ="NewAccountingTypeId")
    String newAccountingTypeId;

    @Column(name = "New_Amount")
    Long amount;

    @Column(name = "New_IsFullCharge")
    Boolean isFullCharge;
}
