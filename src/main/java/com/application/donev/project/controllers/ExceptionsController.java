package com.application.donev.project.controllers;

import com.application.donev.project.errors.EmailAlreadyExists;
import com.application.donev.project.errors.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class ExceptionsController {

    @ExceptionHandler(EmailAlreadyExists.class)
    public ResponseEntity<Object> handlerEmailAlreadyExists(EmailAlreadyExists exception){
        ErrorResponse error = new ErrorResponse(LocalDateTime.now(), 409, exception.getMessage());

        return new ResponseEntity<>(error, HttpStatus.CONFLICT);
    }

}
