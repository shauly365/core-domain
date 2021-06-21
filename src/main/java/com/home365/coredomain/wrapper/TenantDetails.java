package com.home365.coredomain.wrapper;

import com.home365.coredomain.entity.AuditInfo;
import com.home365.coredomain.entity.enums.EntityType;
import com.home365.coredomain.entity.enums.TenantType;
import com.home365.coredomain.entity.inter.IAuditableEntity;
import lombok.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class TenantDetails  implements IAuditableEntity {

    @AuditInfo(ignore = true)
    private String accountId;
    private String firstName;
    private String lastName;
    @AuditInfo(ignore = true)
    private String email;
    private String phoneNumber;
    @AuditInfo(ignore = true)
    private String contactId;


    @AuditInfo(viewName = "Type")
    private TenantType type;
    @AuditInfo(ignore = true)
    private Boolean contactPerson;


    @Override
    public EntityType auditEntityType() {
        return EntityType.Tenant;
    }

    @Override
    public String auditEntityIdentifier() {
        return this.accountId;
    }

    @Override
    public String auditMessage() {
        return null;
    }

    @Override
    public String idOfEntity() {
        return this.accountId;
    }


    public String formattedString() {
        return
                " firstName='" + firstName + '\'' +
                        " lastName='" + lastName + '\'' +
                        " email='" + email + '\'' +
                        " phoneNumber='" + phoneNumber + '\'' +
                        " type=" + type +
                        " contactPerson=" + contactPerson
                ;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        TenantDetails that = (TenantDetails) o;

        return new EqualsBuilder()
                .append(accountId, that.accountId)
                .append(firstName, that.firstName)
                .append(lastName, that.lastName)
                .append(email, that.email)
                .append(phoneNumber, that.phoneNumber)
                .append(contactId, that.contactId)
                .append(type, that.type)
                .append(contactPerson, that.contactPerson)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(accountId)
                .append(firstName)
                .append(lastName)
                .append(email)
                .append(phoneNumber)
                .append(contactId)
                .append(type)
                .append(contactPerson)
                .toHashCode();
    }
}
