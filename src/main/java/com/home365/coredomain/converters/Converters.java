package com.home365.coredomain.converters;

import com.home365.coredomain.entity.AccountExtension;
import com.home365.coredomain.entity.AccountExtensionBase;
import com.home365.coredomain.entity.Files;
import com.home365.coredomain.entity.Tenant;
import com.home365.coredomain.entity.enums.BusinessType;
import com.home365.coredomain.entity.enums.PaymentMethod;
import com.home365.coredomain.entity.enums.VendorStatus;
import com.home365.coredomain.entity.projection.IAccountsPayTo;
import com.home365.coredomain.utils.CodeUtils;
import com.home365.coredomain.wrapper.*;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.sql.Timestamp;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public abstract class Converters {
//    public static TenantJson createTenantJsonFromTenantsRequest(TenantsRequest tenantsRequest, TenantDetails tenantDetails) {
//        TenantJson tenantJson = new TenantJson();
//        tenantJson.setTenantDetails(tenantsRequest.getTenantDetails());
//        tenantJson.setPropertyAddress(tenantsRequest.getPropertyAddress());
//        tenantJson.setLeaseDetails(tenantsRequest.getLeaseDetails());
//        tenantJson.setPropertyAddress(tenantsRequest.getPropertyAddress());
//        tenantJson.setSecurityDeposit(tenantsRequest.getSecurityDeposit());
////        tenantJson.setPropertyId(tenantsRequest.getPropertyId());
//        return tenantJson;
//    }

//    public static TenantJson createTenantJsonFromTenantsRequest(TenantsRequest tenantsRequest) {
//        TenantJson tenantJson = new TenantJson();
//        tenantJson.setTenantDetails(tenantsRequest.getTenantDetails());
//        tenantJson.setPropertyAddress(tenantsRequest.getPropertyAddress());
//        tenantJson.setLeaseDetails(tenantsRequest.getLeaseDetails());
//        tenantJson.setPropertyAddress(tenantsRequest.getPropertyAddress());
//        tenantJson.setSecurityDeposit(tenantsRequest.getSecurityDeposit());
//        tenantJson.setActivities(tenantsRequest.getActivities());
////        tenantJson.setCharges(Collections.singletonList(tenantsRequest.getCharges()));
//        return tenantJson;
//    }

//    public static TenantResponse createTenantResponseFromTenant(Tenant tenant, List<RecurringChargeLight> charges) {
//        TenantResponse tenantResponse = new TenantResponse();
//        tenantResponse.setPropertyAddress(tenant.getTenantJson().getPropertyAddress());
//        tenantResponse.setTenantDetails(tenant.getTenantJson().getTenantDetails());
//        tenantResponse.setSecurityDeposit(tenant.getTenantJson().getSecurityDeposit());
//        tenantResponse.setLeaseDetails(tenant.getTenantJson().getLeaseDetails());
//        tenantResponse.setForwardingAddress(tenant.getTenantJson().getForwardingAddress());
//        final List<Activity> activities = tenant.getTenantJson().getActivities();
//        if (!CollectionUtils.isEmpty(activities)) {
//            tenantResponse.setActivities(activities.stream().map(Converters::getActivityDTOFromActivity).collect(Collectors.toList()));
//        }
//        tenantResponse.setMailDispositionSent(tenant.getTenantJson().getDispositionMailSent() != null && tenant.getTenantJson().getDispositionMailSent());
//        if (tenant.getTenantJson() != null) {
//            tenantResponse.setLastDateOfSentDispositionMail(tenant.getTenantJson().getLastDateOfSentDispositionMail());
//            tenantResponse.setFirstDateOfDispositionMail(tenant.getTenantJson().getFirstDateOfDispositionMail());
//        }
//        tenantResponse.setTenantSDDMetaDataWrapper(tenantSDDMetaDataWrapper(tenant.getTenantJson()));
//        tenantResponse.setPropertyId(tenant.getPropertyId());
//        tenantResponse.setTenantStatus(tenant.getTenantStatus().name());
//        tenantResponse.setFileUrl(tenant.getFileUrl());
//        tenantResponse.setCharges(charges);
//        return tenantResponse;
//    }

//    private static TenantSDDMetaDataWrapper tenantSDDMetaDataWrapper(TenantJson tenantJson) {
//        if (tenantJson == null || tenantJson.getSecurityDispositionMetaData() == null) {
//            return null;
//        }
//        SecurityDispositionMetaData securityDispositionMetaData = tenantJson.getSecurityDispositionMetaData();
//        TenantSDDMetaDataWrapper tenantSDDMetaDataWrapper = new TenantSDDMetaDataWrapper();
//        tenantSDDMetaDataWrapper.setOpenCharges(securityDispositionMetaData.getOpenCharges());
//        tenantSDDMetaDataWrapper.setCheckId(securityDispositionMetaData.getCheckId());
//        tenantSDDMetaDataWrapper.setDepositAmount(securityDispositionMetaData.getDepositAmount());
//        tenantSDDMetaDataWrapper.setOpenChargesDisposition(securityDispositionMetaData.getOpenChargesDisposition());
//        tenantSDDMetaDataWrapper.setOpenCredits(securityDispositionMetaData.getOpenCredits());
//        tenantSDDMetaDataWrapper.setTenantOweCoverage(securityDispositionMetaData.getTenantOweCoverage());
//        tenantSDDMetaDataWrapper.setOriginalDeposit(securityDispositionMetaData.getOriginalDeposit());
//        return tenantSDDMetaDataWrapper;
//    }

//    public static ActivityDTO getActivityDTOFromActivity(Activity activity) {
//        ActivityDTO activityDTO = new ActivityDTO();
//        activityDTO.setOperation(activity.getOperation());
//        activityDTO.setTenantStatus(activity.getTenantStatus());
//        activityDTO.setUser(activity.getUser());
//        activityDTO.setTimestamp(activity.getTimestamp().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
//        return activityDTO;
//    }
//
//
//    public static Optional<TenantDetails> getContactPersonFromTenant(List<TenantDetails> tenantDetails) {
//        return tenantDetails.stream().filter(tenantDetails1 -> CodeUtils.checkIfObjectIsNotNullAndTrue(tenantDetails1.getContactPerson())).findFirst();
//    }


//    public static FileWrapper mapFile(Files file) {
//        if (file == null) {
//            return null;
//        }
//        FileWrapper fileResponse = new FileWrapper();
//        fileResponse.setId(file.getId());
//        fileResponse.setFileName(file.getFileName());
//        fileResponse.setFileUrl(file.getFileUrl());
//        fileResponse.setCategory(file.getCategory());
//        fileResponse.setSubCategory(file.getSubCategory());
//        fileResponse.setCreatedOn(file.getCreatedOn().toString());
//        fileResponse.setActive(file.getIsActive());
//        fileResponse.setEntityType(file.getEntityType());
//        fileResponse.setEntityIdentifier(file.getEntityIdentifier());
//        return fileResponse;
//    }
//
//    public static List<FileWrapper> mapFiles(List<Files> files) {
//        if (CollectionUtils.isEmpty(files)) {
//            return new LinkedList<>();
//        }
//        return files.stream().map(Converters::mapFile).filter(Objects::nonNull).collect(Collectors.toList());
//    }
//
//    public static Files files(FileWrapper fileWrapper, String userId) {
//        if (fileWrapper == null) {
//            return null;
//        }
//        Files files = new Files();
//        files.setId(fileWrapper.getId());
//        files.setIsActive(fileWrapper.getActive());
//        files.setEntityIdentifier(fileWrapper.getEntityIdentifier());
//        files.setCategory(fileWrapper.getCategory());
//        files.setSubCategory(fileWrapper.getSubCategory());
//        files.setFileName(fileWrapper.getFileName());
//        files.setEntityType(fileWrapper.getEntityType());
//        files.setFileUrl(fileWrapper.getFileUrl());
//        files.setUserId(userId);
//        return files;
//    }
//
//    public static List<Files> files(List<FileWrapper> fileWrapper, String userId) {
//        if (!CollectionUtils.isEmpty(fileWrapper)) {
//            return fileWrapper.stream().map(fl -> files(fl, userId)).filter(Objects::nonNull).collect(Collectors.toList());
//        }
//        return new LinkedList<>();
//    }
//
//
//    public static PaymentMethod convertIntToPaymentMethod(Integer paymentMethod) {
//        if (paymentMethod == null) {
//            return PaymentMethod.other;
//        }
//        return PaymentMethod.valueOf(paymentMethod);
//
//
//    }
//
//    public static VendorStatus convertIntToVendorStatus(Integer vendorStatus) {
//        if (vendorStatus == null)
//            return VendorStatus.inactive;
//        switch (vendorStatus) {
//            case 1:
//                return VendorStatus.active;
//            default:
//                return VendorStatus.inactive;
//        }
//    }
//
//    public static VendorRequest convertAccountToVendorRequest(AccountExtension accountExtension, AccountExtensionBase accountExtensionBase) {
//        return VendorRequest.builder()
//                .accountId(accountExtension.getAccountId().toLowerCase())
//                .name(accountExtension.getName())
//                .address(createAddressFromAccount(accountExtensionBase))
//                .birthDay(accountExtensionBase.getBirthDay() != null ?
//                        new Timestamp(accountExtensionBase.getBirthDay().getTime()) : null)
//                .businessType(accountExtensionBase.getCompanyType())
//                .category(getCategoryFromAccount(accountExtensionBase))
//                .ein(accountExtensionBase.getEin())
//                .einDescription(accountExtensionBase.getEinDescription())
//                .email(accountExtension.getEmail())
//                .locationId(accountExtensionBase.getNewManagerId().toLowerCase())
//                .paymentMethod(convertIntToPaymentMethod(accountExtensionBase.getPayeeMethod()))
//                .phoneDetails(getPhoneDetailsFromAccount(accountExtensionBase, accountExtension))
//                .ssn(accountExtensionBase.getSsn())
//                .website(accountExtension.getWebsite())
//                .vendorStatus(convertIntToVendorStatus(accountExtensionBase.getAccountStatus()))
//                .build();
//    }
//
//    public static ServiceProRequest convertAccountToServicePro(AccountExtension accountExtension, AccountExtensionBase accountExtensionBase) {
//        return ServiceProRequest.builder()
//                .accountId(accountExtension.getAccountId().toLowerCase())
//                .name(accountExtension.getName())
//                .address(createAddressFromAccount(accountExtensionBase))
//                .businessType(accountExtensionBase.getCompanyType())
//                .email(accountExtension.getEmail())
//                .locationId(StringUtils.isEmpty(accountExtensionBase.getNewManagerId()) ? null : accountExtensionBase.getNewManagerId().toLowerCase())
//                .paymentMethod(convertIntToPaymentMethod(accountExtensionBase.getPayeeMethod()))
//                .phoneDetails(getPhoneDetailsFromAccount(accountExtensionBase, accountExtension))
//                .website(accountExtension.getWebsite())
//                .vendorStatus(convertIntToVendorStatus(accountExtensionBase.getAccountStatus()))
//                .build();
//    }
//
//    private static PhoneDetails getPhoneDetailsFromAccount(AccountExtensionBase accountExtensionBase, AccountExtension accountExtension) {
//        PhoneDetails phoneDetails = new PhoneDetails();
//        if (accountExtension.getPhone() != null && accountExtension.getPhone().trim().length() > 8)
//            phoneDetails.setFullPhone(accountExtension.getPhone());
//        return phoneDetails;
//    }
//
//    private static Category getCategoryFromAccount(AccountExtensionBase accountExtensionBase) {
//        Category category = new Category();
//        category.setCategoryId(accountExtensionBase.getCategoryId() != null ? accountExtensionBase.getCategoryId().toLowerCase() : null);
//        category.setTypeId(accountExtensionBase.getTypeId() != null ? accountExtensionBase.getTypeId().toLowerCase() : null);
//        return category;
//    }
//
//    private static Address createAddressFromAccount(AccountExtensionBase accountExtensionBase) {
//        return Address.builder()
//                .country(accountExtensionBase.getCountry())
//                .address2(accountExtensionBase.getAddress2())
//                .address(accountExtensionBase.getAddress1())
//                .building(accountExtensionBase.getBuilding())
//                .city(accountExtensionBase.getCity())
//                .fullAddress(accountExtensionBase.getFullAddress())
//                .state(accountExtensionBase.getState())
//                .zipCode(accountExtensionBase.getZipCode())
//                .unit(accountExtensionBase.getUnit())
//                .build();
//
//
//    }
//
//    public static AccountsPayTo convertFromIAccountToPayToModel(IAccountsPayTo iAccountsPayTos) {
//        AccountsPayTo accountsPayTo = new AccountsPayTo();
//        accountsPayTo.setAddress(iAccountsPayTos.getAddress());
//        accountsPayTo.setBusinessType(iAccountsPayTos.getBusinessType());
//        if (!StringUtils.isEmpty(iAccountsPayTos.getCategoryId()) && !StringUtils.isEmpty(iAccountsPayTos.getTypeId())) {
//            Category category = new Category();
//            category.setCategoryId(iAccountsPayTos.getCategoryId().toLowerCase());
//            category.setTypeId(iAccountsPayTos.getTypeId().toLowerCase());
//            accountsPayTo.setCategory(category);
//        }
//        accountsPayTo.setHasDiscountCapability(iAccountsPayTos.getHasDiscountCapability());
//        accountsPayTo.setId(iAccountsPayTos.getId().toLowerCase());
//        accountsPayTo.setName(iAccountsPayTos.getName());
//        accountsPayTo.setPayeeMethod(iAccountsPayTos.getPayeeMethod());
//        accountsPayTo.setUserType(BusinessType.valueOf(iAccountsPayTos.getBusinessType()).name().toLowerCase());
//        if (accountsPayTo.getUserType().equalsIgnoreCase("pm"))
//            accountsPayTo.setUserType("home365");
//
//
//        return accountsPayTo;
//    }
}
