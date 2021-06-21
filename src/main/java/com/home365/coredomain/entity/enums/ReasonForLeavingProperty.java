package com.home365.coredomain.entity.enums;

public enum ReasonForLeavingProperty {
    SoldByHome365_PropertyStaysInHome365,SoldByHome365_PropertyNotStaysInHome365,SoldBy3RdParty,
    SelfManage,MovingToAnotherPM,ContractTerminatedByPM,Other;


    public String getAuditName(){
        if(this.equals(SoldByHome365_PropertyNotStaysInHome365)){
            return " Sold By Home365 - Property Not Stays In Home365 ";
        }
        if(this.equals(SoldByHome365_PropertyStaysInHome365)){
            return " Sold By Home365 - Property  Stays In Home365 ";
        }
        if(this.equals(SoldBy3RdParty)){
            return  " Sold by third party ";
        }
        if(this.equals(ContractTerminatedByPM)){
            return " Contract terminated by PM";
        }
        return this.name();
    }
}
