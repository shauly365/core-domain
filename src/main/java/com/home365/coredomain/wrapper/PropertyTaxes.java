package com.home365.coredomain.wrapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PropertyTaxes implements Serializable {
    String whoPays;
    String propertyTaxesAuthority;
    String taxAccountNumber;
}
