package com.example.ChatApp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Arrays;
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(DuplicationRecordException.class)
    public ResponseEntity<?> handelDuplicationRecordException(DuplicationRecordException ex){
    ErrorResponse error=new ErrorResponse(ex.getLocalizedMessage(), Arrays.asList(ex.getMessage()));
    return ResponseEntity.status(HttpStatus.CONFLICT)
            .body(error);
    }
    @ExceptionHandler(RecordNotFoundException.class)
    public ResponseEntity<?> handelRecordNotFoundException(RecordNotFoundException ex){
        ErrorResponse error=new ErrorResponse(ex.getLocalizedMessage(), Arrays.asList(ex.getMessage()));
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(error);
    }
    @ExceptionHandler(ApiRequestException.class)
    public ResponseEntity<?> handelApiRequestException(ApiRequestException ex){
        ErrorResponse error=new ErrorResponse(ex.getLocalizedMessage(), Arrays.asList(ex.getMessage()));
        return ResponseEntity.status(HttpStatus.NO_CONTENT)
                .body(error);
    }
}
