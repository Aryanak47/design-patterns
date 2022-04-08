package com.example.error;

public class InstitutionNotFoundException extends RuntimeException{
    public InstitutionNotFoundException(long id) {
        super("Institution[id=" + id + "] was not found");
    }

    public InstitutionNotFoundException(String message) {
        super(message);
    }

}
