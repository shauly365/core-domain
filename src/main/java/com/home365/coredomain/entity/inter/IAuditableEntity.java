package com.home365.coredomain.entity.inter;


import com.home365.coredomain.entity.enums.EntityType;

public interface IAuditableEntity {

    EntityType auditEntityType();
    String auditEntityIdentifier();
    String auditMessage();
    String idOfEntity();
}
