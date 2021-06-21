package com.home365.coredomain.wrapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Insurance implements Serializable {

    String whoPays;
    String insuranceCompany;
    Date insuranceEndDate;
    String policyNumber;
    List<InsuranceFile> files;
}