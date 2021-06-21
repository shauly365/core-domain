package com.home365.coredomain.entity;

import com.home365.coredomain.entity.enums.EntityType;
import com.home365.coredomain.entity.inter.IAuditableEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "`ContactBase`")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContactBase implements IAuditableEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "ContactId", updatable = false, nullable = false)
    private String contactId;

    @Column(name = "MobilePhone")
    @AuditInfo(ignore = true)
    private String mobilePhone;

    @Column(name = "Telephone1")
    @AuditInfo(ignore = true)
    private String displayPhone;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "EMailAddress1")
    @AuditInfo(ignore = true)
    private String email;

    @Column(name = "AccountId")
    private String accountId;

    @Column(name = "StatusCode")
    private Integer statusCode;

    @Column(name = "DeletionStateCode")
    @AuditInfo(ignore = true)
    private Integer deletionCode = 0;

    @Column(name = "StateCode")
    private final Integer stateCode = 0;

    @Column(name = "FullName")
    @AuditInfo(ignore = true)
    private String fullName;

    @Column(name = "Description")
    private String description;

    @Column
    private String countryName;

    @Column
    private String iso;

    @Column
    private String phonePrefix;

    @Column
    private Boolean primaryContact;
    @Column(name = "createdOn")
    private LocalDateTime createdOn;
    @Column(name = "createdBy")
    private String createdBy;
    @Column(name = "ModifiedBy")
    private String modifiedBy;
    @Column(name = "modifiedOn")
    private LocalDateTime modifiedOn;

    @Override
    public EntityType auditEntityType() {
        return EntityType.ContactBase;
    }

    @Override
    public String auditEntityIdentifier() {
        return this.contactId;
    }

    @Override
    public String auditMessage() {
        return null;
    }

    @Override
    public String idOfEntity() {
        return this.contactId;
    }
}
