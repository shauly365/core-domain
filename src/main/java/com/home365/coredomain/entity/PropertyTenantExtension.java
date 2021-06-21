package com.home365.coredomain.entity;

import com.home365.coredomain.entity.enums.LeaseType;
import com.home365.coredomain.entity.enums.TenantStatus;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "`New_property_tenantExtensionBase`")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PropertyTenantExtension {

    @Id
    @Column(name = "New_property_tenantId")
    private String propertyTenantId;

    @Column(name = "new_propertyid")
    private String propertyId;

    @Column(name = "new_propertyaccountid")
    private String propertyAccountId;

    @Column(name = "New_RentAmount")
    private Long rentAmount;

    @Column(name = "New_TenantPhone")
    private String tenantPhone;

    @Column(name = "New_IsActive")
    private Boolean active;

    @Column(name = "New_PropertyUserType")
    private Integer userType;

    @Column(name = "New_EndDate")
    private LocalDateTime endDate;

    @Column(name = "New_StartDate")
    private LocalDateTime startDate;

//    @Column(name = "move_out_date")
//    private Date moveOutDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "lease_type")
    private LeaseType leaseType;

    @Column(name = "days_left")
    private Integer daysLeft;

    @Column(name = "new_phonedisplay")
    @AuditInfo(ignore = true)
    private String displayPhone;

    @Column(name = "new_contactid")
    private String contactId;

    @Column(name = "New_TenantName")
    private String firstName;

    @Column(name = "new_lastname")
    private String tenantLastName;

    @Column(name = "new_email")
    private String tenantEmail;

    @Column(name = "moveOutDate")
    private LocalDate moveOutDate;

    @Column(name = "leaseStatus")
    @Enumerated(EnumType.STRING)
    private TenantStatus leaseStatus;

    @Column(name = "New_AffordableRent")
    private Integer affordableRent;



}
