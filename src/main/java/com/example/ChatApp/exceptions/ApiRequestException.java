package com.example.ChatApp.exceptions;

public class ApiRequestException extends RuntimeException{
    public ApiRequestException() {
        super();
    }

    public ApiRequestException(String message) {
        super(message);
    }
}
