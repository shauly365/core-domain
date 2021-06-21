package com.home365.coredomain.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "`Files`")
public class Files implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "FileUrl")
    private String fileUrl;

    @Column(name = "FileName")
    private String fileName;

    @CreationTimestamp
    private LocalDate createdOn = LocalDate.now();

    @Column(name = "EntityIdentifier")
    private String entityIdentifier;

    @Column(name = "EntityType")
    private String entityType;

    @Column(name = "Category")
    private String category;

    @Column(name = "SubCategory")
    private String subCategory;

    @Column(name = "IsActive")
    private Boolean isActive;

    @Column(name = "UserId")
    private String userId;

}
