package com.home365.coredomain.entity;

import com.home365.coredomain.converters.PropertySpecialBillsJsonConverter;
import com.home365.coredomain.entity.enums.EntityType;
import com.home365.coredomain.entity.inter.IAuditableEntity;
import com.home365.coredomain.wrapper.PropertySpecialBills;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "`New_propertyExtensionBase`")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PropertyExtensionBase implements IAuditableEntity {

    @Id
    @Column(name = "New_propertyId")
    @AuditInfo(ignore = true)
    private String propertyId;

    @Column(name = "New_FullAddress")
    @AuditInfo(ignore = true)
    private String fullAddress;

    @Column(name = "New_IsActive")
    @AuditInfo(ignore = true)
    boolean active;

    @Column(name = "New_ShortenAddress")
    @AuditInfo(ignore = true)
    private String shortAddress;

    @Column(name = "new_propertyplanid")
    @AuditInfo(ignore = true)
    String propertyPlanId;

    @Column(name = "New_Building")
    String building;

    @Column(name = "New_Unit")
    String unit;

    @Column(name = "New_RegionId")
    String regionId;

    @Column(name = "New_InsuranceProvider")
    String insuranceProvider;

    @Column(name = "New_InsuranceExpiredDate")
    Date insuranceExpiredDate;

    @Column(name = "New_Type")
    Integer propertyType;

    @Column
    String city;

    @Column
    String state;

    @Column
    String zipCode;

    @Column
    String country;

    @Column
    @AuditInfo(viewName = "Account Manager")
    private String accountManagerId;

    @Column(name = "New_Latitude")
    @AuditInfo(ignore = true)
    private Double latitude;

    @Column(name = "New_Longitude")
    @AuditInfo(ignore = true)
    private Double longitude;

    @Column(name = "PropertyStatus")
    private String propertyStatus;

    @Column(name = "PhasingOutDate")
    private LocalDate phasingOutDate;

    @Column(name = "ReasonForLeaving")
    private String reasonForLeaving;

    @Column(name = "Memo")
    @AuditInfo(viewName = "description")
    private String memo;

    @Column(name = "PhaseOutActionDate")
    @AuditInfo(viewName = "Phasing out date")
    private LocalDate phaseOutActionDate;

    @Column(name = "New_InactiveDate")
    private LocalDateTime inactiveDate;

    @Column(name = "PropertySpecialBills")
    @Convert(converter = PropertySpecialBillsJsonConverter.class)
    private PropertySpecialBills propertySpecialBills;

    @Column(name = "locationId")
    private String locationId;


    @Override
    public EntityType auditEntityType() {
        return EntityType.Property;
    }

    @Override
    public String auditEntityIdentifier() {
        return this.propertyId;
    }

    @Override
    public String auditMessage() {
        return null;
    }

    @Override
    public String idOfEntity() {
        return this.propertyId;
    }
}

