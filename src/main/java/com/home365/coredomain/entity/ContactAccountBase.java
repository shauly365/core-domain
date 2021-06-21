package com.home365.coredomain.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "`New_contactaccountBase`")
public class ContactAccountBase {
    @Id
    @Column(name = "New_contactaccountId")
//    @GeneratedValue(generator = )
    private String contactAccountId;

    @Column(name = "DeletionStateCode")
    private final Integer deletionCode = 0;

    @Column(name = "StateCode")
    private final Integer stateCode = 0;

    @Column(name = "statuscode")
    private Integer statusCode;

    @Column(name = "createdBy")
    private String createdBy;

    @Column(name = "createdOn")
    private LocalDateTime createdOn;

    @Column(name = "ModifiedOn")
    private LocalDateTime modifiedOn;

    @Column(name = "ModifiedBy")
    private String modifiedBy;

}
