package com.home365.coredomain.entity;

import com.home365.coredomain.converters.TenantJsonConverter;
import com.home365.coredomain.entity.enums.EntityType;
import com.home365.coredomain.entity.enums.TenantStatus;
import com.home365.coredomain.entity.inter.IAuditableEntity;
import com.home365.coredomain.wrapper.TenantJson;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.util.StringUtils;

import javax.persistence.*;

@Data
@Entity
public class Tenant  implements IAuditableEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", updatable = false, nullable = false)
    @AuditInfo(ignore = true)
    private String id;
    @Convert(converter = TenantJsonConverter.class)
    private TenantJson tenantJson;
    @Column(name = "propertyId")
    @AuditInfo(ignore = true)
    private String propertyId;
    @Column(name = "balance")
    private Long balance;
    @Column(name = "tenantStatus")
    @Enumerated(EnumType.STRING)
    private TenantStatus tenantStatus;

    @Column(name = "profileUrl")
    private String fileUrl;
    @Column(name = "accountId")
    @AuditInfo(ignore = true)
    private String accountId;
    @Override
    public EntityType auditEntityType() {
        return EntityType.Tenant;
    }

    @Override
    public String auditEntityIdentifier() {
        if(StringUtils.isEmpty(id)){
            return this.accountId;
        }
        return this.id;
    }

    @Override
    public String auditMessage() {
        return null;
    }

    @Override
    public String idOfEntity() {
        return this.id;
    }
}
