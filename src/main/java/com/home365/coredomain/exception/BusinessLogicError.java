package com.home365.coredomain.exception;

/**
 * BusinessLogicError message to be shown by front - status code 409
 */
public class BusinessLogicError extends Exception {
    public BusinessLogicError() {
    }

    public BusinessLogicError(String message) {
        super(message);
    }
}
