package com.home365.coredomain.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "`New_propertyplanExtensionBase`")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PropertyPlanExtension {

    @Id
    @Column(name = "New_propertyplanId")
    private String id;
    @Column(name = "New_PropertyPlanTypeId")
    private String planTypeId;
    @Column(name = "New_PropertyId")
    private String propertyId;
    @Column(name = "New_Status")
    private Integer status;
    @Column(name = "New_IncludeInProjectedBalance")
    private Boolean includeInProjectedBalance;
    @Column(name = "New_EffectiveDate")
    private LocalDateTime effectiveDate;
}
