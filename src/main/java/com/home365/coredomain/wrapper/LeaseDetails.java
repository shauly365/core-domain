package com.home365.coredomain.wrapper;

import com.home365.coredomain.entity.AuditInfo;
import com.home365.coredomain.entity.enums.LeaseType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LeaseDetails {
    @AuditInfo(viewName = "Lease type")
    private LeaseType type;
    @AuditInfo(viewName =  "Lease agreement",removedAction = " lease agreement removed",action =  " lease agreement was added")
    private String agreement;
    @AuditInfo(viewName = "Lease start date")
    private LocalDateTime startDate;
    @AuditInfo(viewName = "Lease end date")
    private LocalDateTime endDate;
    @AuditInfo(viewName = "Lease move out date")
    private LocalDate moveOutDate;
    private Long totalRent;

    @Override
    public String toString() {
        return
                "type=" + type +
                        ", startDate=" + startDate.toLocalDate() +
                        ", endDate=" + endDate.toLocalDate() +
                        ", moveOutDate=" + moveOutDate
                ;
    }
}
