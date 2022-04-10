package com.example.error;

import io.micronaut.http.HttpStatus;

public class InstitutionNotFoundException extends RuntimeException{
    private HttpStatus status;
    public InstitutionNotFoundException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }


}
