package com.example.clients.dto;

public class FieldMessage {
    private final String fieldName;
    private final String message;

    FieldMessage(String fieldName, String message) {
        this.fieldName = fieldName;
        this.message = message;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getMessage() {
        return message;
    }
}

