package com.home365.coredomain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
@Table(name = "`New_propertyaccountBase`")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PropertyAccountBase {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "New_propertyaccountId", updatable = false, nullable = false)
    private String newPropertyaccountId;
    private final int statecode = 0;
    private final Integer statuscode = 1;


}
