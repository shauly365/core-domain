package com.home365.coredomain.exception;

public class ObjectNotFoundLocal extends Exception {
    private static final String MESSAGE = "Unable to find [%s] With Id [%s]";
    public ObjectNotFoundLocal(String resourceType, String id) {
        super(String.format(MESSAGE, resourceType, id));
    }



}
