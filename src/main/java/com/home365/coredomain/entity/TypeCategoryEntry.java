package com.home365.coredomain.entity;

import com.home365.coredomain.entity.enums.TransferTo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Immutable
@Entity
public class TypeCategoryEntry {


    @Column(insertable = false, updatable = false)
    @Id
    String id;
    @Column(insertable = false, updatable = false)
    String type;
    @Column(insertable = false, updatable = false)
    String category;
    @Column(insertable = false, updatable = false)
    String categoryId;
    @Column(insertable = false, updatable = false)
    String typeId;
    @Column(insertable = false, updatable = false)
    int categoryType;
    @Enumerated(EnumType.STRING)
    @Column(insertable = false, updatable = false)
    TransferTo transferTo;
    @Column(insertable = false, updatable = false)
    Boolean hideFromPortal;

    @Transient
    String display;
}
