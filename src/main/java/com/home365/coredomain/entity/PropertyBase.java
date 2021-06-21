package com.home365.coredomain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "`New_propertyBase`")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PropertyBase {
    @Id
    @Column(name = "New_propertyId")
    private String propertyId;

    @Column(name = "DeletionStateCode")
    private final Integer deletionCode = 0;

    @Column(name = "StateCode")
    private final Integer stateCode = 0;

    @Column(name = "CreatedOn")
    Timestamp createdOn;

}

