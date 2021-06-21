package com.home365.coredomain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "`New_primaryexpertiseExtensionBase`")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NewPrimaryexpertiseExtensionBase {

    @Id
    @Column(name = "New_primaryexpertiseId")
    private String primaryExpertiseId;
    @Column(name = "new_name")
    private String newName;
    @Column(name = "New_Display")
    private Boolean newDisplay;


}
