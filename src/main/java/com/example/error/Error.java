package com.example.error;

public class Error {

    private String message;

    private int status;

    public Error(String message, int status) {
        this.message = message;
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
