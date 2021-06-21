package com.home365.coredomain.entity;

import com.home365.coredomain.entity.enums.EntityType;
import com.home365.coredomain.entity.inter.IAuditableEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "`AccountBase`")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountExtension  implements IAuditableEntity, Serializable {

    @Id
    @Column(name = "AccountId")
    private String accountId;

    @Column(name = "Name")
    private String name;

    @Column(name = "EMailAddress1")
    private String email;

    @Column(name = "Telephone1")
    private String phone;

    @Column(name = "Telephone2")
    @AuditInfo(ignore = true)
    private String displayPhone;

    @Column(name = "DeletionStateCode")
    private final Integer deletionCode = 0;

    @Column(name = "StateCode")
    private final Integer stateCode = 0;

    @Column(name = "ParentAccountId")
    private String parentAccountId;

    @Column(name = "StatusCode")
    private Boolean statusCode;

    @Column(name = "createdOn")
    private Timestamp createdOn;

    @Column(name = "WebSiteURL")
    private String website;

    @Override
    public EntityType auditEntityType() {
        return EntityType.Account;
    }

    @Override
    public String auditEntityIdentifier() {
        return this.accountId;
    }

    @Override
    public String auditMessage() {
        return null;
    }

    @Override
    public String idOfEntity() {
        return this.accountId;
    }


}
