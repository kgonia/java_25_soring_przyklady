package com.sda.examples.spring.bootdemo.configuration;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(value = UnsupportedOperationException.class)
    protected ResponseEntity<Object> handleUnsupported(
            RuntimeException ex, WebRequest request) {
        RestError restError = new RestError();
        restError.setMessage("Nie umiesz korzystać z apki");
        ResponseEntity<Object> objectResponseEntity = ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(restError);
        return objectResponseEntity;
    }
}



