package com.home365.coredomain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "`New_propertyaccountBase`")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PropertyAccountBaseForCompanyCreation {

    @Id
    @Column(name = "New_propertyaccountId", nullable = false)
    private String newPropertyaccountId;
    private final int statecode = 0;
    private final Integer statuscode = 1;


}
