package com.home365.coredomain.converters;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.home365.coredomain.wrapper.TenantJson;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.AttributeConverter;
import java.io.IOException;

@Slf4j
public class TenantJsonConverter implements AttributeConverter<TenantJson, String> {
    private final ObjectMapper objectMapper;

    public TenantJsonConverter(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public String convertToDatabaseColumn(TenantJson customerInfo) {

        String customerInfoJson = null;
        try {
            customerInfoJson = objectMapper.writeValueAsString(customerInfo);
        } catch (final JsonProcessingException e) {
            log.error("JSON writing error", e);
        }

        return customerInfoJson;
    }

    @Override
    public TenantJson convertToEntityAttribute(String customerInfoJSON) {
        TenantJson customerInfo = null;
        try {
            customerInfo = objectMapper.readValue(customerInfoJSON, TenantJson.class);
        } catch (final IOException e) {
            log.error("JSON reading error", e);
        }

        return customerInfo;
    }
}
