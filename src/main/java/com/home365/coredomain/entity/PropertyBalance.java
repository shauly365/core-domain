package com.home365.coredomain.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@Table(name = "`PROPERTY_BALANCE`")
public class PropertyBalance {
    @Id
    @Column(name = "id")
    private String id;

    private String name;
    @Deprecated
    private int month;
    @Column(columnDefinition="text")
    private String statement;

    @Column(name = "property_id")
    private String propertyId;

    @Column(name = "account_id")
    private String accountId;

    @Column(name = "total_incomes")
    private double totalIncomes;

    @Column(name = "total_expenses")
    private double totalExpenses;

    @Column(name = "total_approved_bills")
    private double totalApprovedBills;

    private double balance;

    @Column(name = "begin_balance")
    private double beginBalance;

    @Column(name = "projected_balance")
    private double projectedBalance;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created", nullable = false, updatable = false)
    private Date created;
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated")
    private Date updated;

    @Column(name = "is_open")
    private boolean isOpen;

    @Column(name = "cycle_start_date")
    private Date cycleStartDate;

    @Column(name = "cycle_end_date")
    private Date cycleEndDate;

    private double reserve;

    @Column(name = "tenant_security_deposit")
    private double tenantSecurityDeposit;

    @Column(name = "balance_month")
    private String balanceMonth;

    @Column(name = "od_transaction_id")
    private String ownerDrawTransactionId;

    @Column(name = "owner_draw_status")
    private String ownerDrawStatus;

    @Column(name = "owner_draw_date")
    private Date ownerDrawDate;

    @Column(name = "owner_draw_details")
    private String ownerDrawDetails;

    @Column(name = "total_owner_draw")
    private double totalOwnerDraw;

    @Column(name = "statement_open_time")
    private Date statementOpenDatetime;

    @Column(name = "statement_close_time")
    private Date statementCloseDatetime;
}
