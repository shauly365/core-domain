package com.home365.coredomain.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "`New_propertyplanBase`")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PropertyPlanBase {

    @Id
    @Column(name = "New_propertyplanId")
    private String id;
    @Column(name = "DeletionStateCode")
    private final Integer deletionCode = 0;
    @Column(name = "StateCode")
    private final Integer stateCode = 0;
}
