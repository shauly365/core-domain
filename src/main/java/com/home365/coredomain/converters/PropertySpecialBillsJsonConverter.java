package com.home365.coredomain.converters;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.home365.coredomain.wrapper.PropertySpecialBills;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.AttributeConverter;
import java.io.IOException;

@Slf4j
public class PropertySpecialBillsJsonConverter implements AttributeConverter<PropertySpecialBills, String> {
    private final ObjectMapper objectMapper;

    public PropertySpecialBillsJsonConverter(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public String convertToDatabaseColumn(PropertySpecialBills info) {

        String infoJson = "{}";
        try {
            infoJson = objectMapper.writeValueAsString(info);
        } catch (final JsonProcessingException e) {
            log.error("JSON writing error", e);
        } finally {
            return infoJson;
        }
    }

    @Override
    public PropertySpecialBills convertToEntityAttribute(String infoJSON) {

        PropertySpecialBills info = PropertySpecialBills.builder().build();
        try {

            info = objectMapper.readValue(infoJSON, PropertySpecialBills.class);
        } catch (final IOException e) {
            log.error("JSON reading error", e);
        } finally {
            return info;
        }
    }
}
