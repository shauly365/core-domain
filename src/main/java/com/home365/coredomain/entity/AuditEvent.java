package com.home365.coredomain.entity;


import com.home365.coredomain.entity.enums.EntityType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Entity
@Table(name = "`AUDIT_EVENT`")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuditEvent {
    @Id
    String id;

    @Column
    String userId;

    @Column
    @Enumerated(EnumType.STRING)
    EntityType entityType;

    @Column
    String entityIdentifier;

    @Column
    String message;

    @Column
    private LocalDateTime createdOn = LocalDateTime.now(ZoneOffset.UTC);

    @Column
    private LocalDateTime updatedOn = LocalDateTime.now(ZoneOffset.UTC);

    @Column
    private String comment;

}
