package com.home365.coredomain.wrapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InsuranceFile implements Serializable {
    Boolean active;
    Date createdOn;
    String entityIdentifier;
    String entityType;
    String id;
    String subCategory;
    String fileName;
    String fileUrl;
    String category;
}

