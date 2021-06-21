package com.home365.coredomain.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "`New_contactaccountExtensionBase`")
public class ContactAccountExtensionBase {
    private String contactAccountId;
    private String newName;
    private String newPassword;
    private Timestamp newPasswordCreatedAt;
    private Integer newUserType;
    private String newAccountId;
    private String newContactId;
    private Boolean contactPerson;



    @Id
    @Column(name = "New_contactaccountId")
    public String getContactAccountId() {
        return contactAccountId;
    }

    public void setContactAccountId(String newContactaccountId) {
        this.contactAccountId = newContactaccountId;
    }


    @Column(name = "contactPerson")
    public Boolean getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(Boolean contactPerson) {
        this.contactPerson = contactPerson;
    }

    @Basic
    @Column(name = "New_name")
    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    @Basic
    @Column(name = "New_Password")
    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    @Basic
    @Column(name = "New_PasswordCreatedAt")
    public Timestamp getNewPasswordCreatedAt() {
        return newPasswordCreatedAt;
    }

    public void setNewPasswordCreatedAt(Timestamp newPasswordCreatedAt) {
        this.newPasswordCreatedAt = newPasswordCreatedAt;
    }

    @Basic
    @Column(name = "New_UserType")
    public Integer getNewUserType() {
        return newUserType;
    }

    public void setNewUserType(Integer newUserType) {
        this.newUserType = newUserType;
    }

    @Basic
    @Column(name = "new_accountid")
    public String getNewAccountId() {
        return newAccountId;
    }

    public void setNewAccountId(String newAccountid) {
        this.newAccountId = newAccountid;
    }

    @Basic
    @Column(name = "new_contactid")
    public String getNewContactId() {
        return newContactId;
    }

    public void setNewContactId(String newContactid) {
        this.newContactId = newContactid;
    }

}
