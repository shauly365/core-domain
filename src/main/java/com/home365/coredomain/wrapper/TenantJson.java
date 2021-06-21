package com.home365.coredomain.wrapper;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.home365.coredomain.entity.AuditInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TenantJson {

    private String propertyAddress;
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    @AuditInfo(ignore = true)
    private List<TenantDetails> tenantDetails;
    private SecurityDeposit securityDeposit;
    private LeaseDetails leaseDetails;
    @AuditInfo(ignore = true)
    private SecurityDispositionMetaData securityDispositionMetaData;
    private ForwardingAddress forwardingAddress;
    @AuditInfo(ignore = true)
    private List<Activity> activities;
    @Deprecated
    private String propertyId;
    @AuditInfo(ignore = true)
    private Boolean dispositionMailSent = false;
    @AuditInfo(ignore = true)
    private LocalDate firstDateOfDispositionMail = null;
    @AuditInfo(ignore = true)
    private LocalDate lastDateOfSentDispositionMail;


    public synchronized void addActivity(Activity activity) {
        if (this.getActivities() == null) {
            this.activities = new ArrayList<>();
            this.activities.add(activity);
        } else {
            this.getActivities().add(activity);
        }
    }
}
