package com.home365.coredomain.entity;

import com.home365.coredomain.entity.enums.CreditType;
import com.home365.coredomain.entity.enums.EntityType;
import com.home365.coredomain.entity.enums.OwnerDrawStatus;
import com.home365.coredomain.entity.enums.TransactionType;
import com.home365.coredomain.entity.inter.IAuditableEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.ObjectUtils;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "`Transactions`")
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Transactions implements Serializable, IAuditableEntity {

    public static Set<String> expensesStatusSet = new HashSet<String>() {{
        add("Paid");
        add("paid");
        add("paymentReversal");
    }};

    public static Set<String> approvedStatusSet = new HashSet<String>() {{
        add("readyForPayment");
        add("paymentFailed");
        add("pendingContribution");
        add("approved");
    }};

    @Id
    private String transactionId = UUID.randomUUID().toString();
    private String pmAccountId;
    @AuditInfo(ignore = true)
    private String receiveAccountId;
    @AuditInfo(ignore = true)
    private String chargeAccountId;
    @AuditInfo(ignore = true)
    private String propertyId;
    @AuditInfo(ignore = true)
    private String paymentId;
    private Long amount;
    @AuditInfo(viewName = "Amount before discount",ignore = true)
    private Long amountBeforeDiscount;
    private String status;
    private String billType;
    private String isDeductible;
    private String isRecurring;
    @Column(updatable = false, insertable = false)
    private java.sql.Timestamp createdOn;
    @Column(updatable = false, insertable = false)
    private java.sql.Timestamp date;
    private java.sql.Timestamp dueDate;
    @AuditInfo(viewName = "Reference Number")
    private String referenceNumber;
    private String memo;
    @AuditInfo(ignore = true)
    private String accountingTypeId;
    @AuditInfo(ignore = true)
    private String categoryId;
    @AuditInfo(ignore = true)
    private String referenceTransactionId;
    @AuditInfo(ignore = true)
    private String incidentAccountId;
    private String accountingName;
    @AuditInfo(viewName = "category")
    private String categoryName;
    private String statementType;
    private String checkMemo;
    private String FileUrl;


    @Column(name = "DiscountDescription")
    private String discountDescription;

    @Column(updatable = false, insertable = false, name = "TransactionNumber")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer transactionNumber;
    @Enumerated(value = EnumType.STRING)
    private OwnerDrawStatus ownerDrawStatus;
    @Column(name = "chargedby")
    private String chargedBy;
    @Column(name = "PayBy")
    private String payBy;
    @Enumerated(value = EnumType.STRING)
    @Column(name = "TransactionType")
    private TransactionType transactionTypeLocal;
    @Column(name = "Version")
    private Long version;
    @Column(name = "RecurringTemplateId")
    private String recurringTemplateId;
    @Column(name = "CreditTransactionType")
    @Enumerated(value = EnumType.STRING)
    private CreditType creditTransactionType;
    @Column(name = "WasCredited")
    private Boolean wasCredited;
    @Column(name = "CreditTransactionId")
    private String creditTransactionId;
    @Column(name = "ToIncludeInTenantBalance")
    private Boolean ToIncludeInTenantBalance = true;
    @Column(name = "CreditComment")
    private String creditComment;
    @Column(name = "creditedBy")
    private String creditedBy;


    @Override
    public EntityType auditEntityType() {
        return EntityType.Transaction;
    }

    @Override
    public String auditEntityIdentifier() {
        if (!ObjectUtils.isEmpty(this.getTransactionId())) {
            return this.getTransactionId();
        }
        if(this.getTransactionNumber() != null){
            return this.getTransactionNumber().toString();
        }
        return  "-1";
    }

    @Override
    public String idOfEntity() {
        return this.getTransactionId();
    }

    @Override
    public String auditMessage() {
        return this.getMemo();
    }
}
