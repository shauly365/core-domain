package com.home365.coredomain.entity;

import com.home365.coredomain.entity.enums.ReasonForLeavingProperty;
import lombok.Data;

@Data
public class LeavePropertyReason {
    ReasonForLeavingProperty reasonForLeavingPropertyEnum;
    String valueForDisplay;
}
