package com.home365.coredomain.wrapper;

import com.home365.coredomain.entity.AuditInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Activity {
    @AuditInfo(ignore = true)
    private String user;
    @AuditInfo(ignore = true)
    private LocalDateTime timestamp;
    @AuditInfo(ignore = true)
    private String operation;
    @AuditInfo(ignore = true)
    private String tenantStatus;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Activity activity = (Activity) o;

        return new EqualsBuilder()
                .append(user, activity.user)
                .append(timestamp, activity.timestamp)
                .append(operation, activity.operation)
                .append(tenantStatus, activity.tenantStatus)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(user)
                .append(timestamp)
                .append(operation)
                .append(tenantStatus)
                .toHashCode();
    }
}
