package com.home365.coredomain.entity;

import com.home365.coredomain.entity.enums.TransferTo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "`NewAccountingType`")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewAccountingType {
    @Id
    @Column(name = "Id")
    private String id;
    @Column(name = "Name")
    private String name;
    @Column(name = "status")
    private Integer status;
    @Column(name = "IsHome365FullCharge")
    private Boolean isHome365FullCharge;
    @Column(name = "Home365CoverPrice")
    private Integer home365CoverPrice;
    @Column(name = "EffectiveFirstDays")
    private Integer effectiveFirstDays;
    @Column(name = "ChargeName")
    private String chargeName;
    @Column(name = "ReceiveName")
    private String receiveName;
    @Column(name = "Enum")
    private Integer Local;
    @Column(name = "isBillCategory")
    private boolean isBillCategory;
    @Column(name = "CreatedOn")
    private Timestamp createdOn;
    @Column(name = "TransferTo")
    @Enumerated(value = EnumType.STRING)
    private TransferTo transferTo;
}
