package com.home365.coredomain.entity;

import com.home365.coredomain.entity.enums.EntityType;
import com.home365.coredomain.entity.inter.IAuditableEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "`ContactExtensionBase`")
public class ContactExtensionBase implements IAuditableEntity {

    @Id
    @Column(name = "ContactId")
    private String contactId;

    @Column(name = "new_countryid")
    private String countryId;

    @Column(name = "New_isMobileApp", columnDefinition = "boolean")
    private final Boolean mobileApp = true;

    @Column(name = "New_Origin")
    private final Integer origin = 1;

    @Column(name = "New_ReportOrigin")
    private final Integer reportOrigin = 1;

    @Column(name = "New_Type")
    private final Boolean newType = true;

    @Column(name = "tenantId")
    private String tenantId;

    @Column(name = "new_accountid")
    private String newAccountid;

    @Column(name = "New_profileImageUrl")
    private String profileImageUrl;

    @Override
    public EntityType auditEntityType() {
        return EntityType.Contact;
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
