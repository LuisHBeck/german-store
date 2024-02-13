package com.beck.marketplace.infra.validation;

public class ValidException extends RuntimeException{
    public ValidException(String message) {
        super(message);
    }
}
