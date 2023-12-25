package com.example.ChatApp.exceptions;

public class DuplicationRecordException extends RuntimeException{
    public DuplicationRecordException(){
        super();
    }
    public DuplicationRecordException(String message){
        super(message);
    }
}
