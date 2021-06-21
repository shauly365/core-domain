package com.home365.coredomain.wrapper;

import com.home365.coredomain.entity.AuditInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SecurityDeposit {
    @AuditInfo(viewName = "Security deposit amount")
    private Long amount;
}
