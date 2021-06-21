package com.home365.coredomain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Immutable
public class OwnerDetailsEntry {
    @Id
    String contactId;
    String firstName;
    String lastName;
    String fullName;
    String mobilePhone;
    String email;
}
