package com.home365.coredomain.wrapper;

import com.home365.coredomain.entity.AuditInfo;
import lombok.Data;

import java.util.List;

@Data
public class SecurityDispositionMetaData {
    @AuditInfo(ignore = true)
    private List<String> openCharges;
    @AuditInfo(ignore = true)
    private List<String> openChargesDisposition;
    @AuditInfo(ignore = true)
    private List<String> openCredits;
    @AuditInfo(ignore = true)
    private Long depositAmount;
    @AuditInfo(ignore = true)
    private String checkId;
    @AuditInfo(ignore = true)
    private String tenantOweCoverage;
}
