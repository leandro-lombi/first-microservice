package com.lombi.leandro.microservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(value = {ApiRequestException.class})
    public ResponseEntity<Object> handleApiRequestException(ApiRequestException e) {
        HttpStatus badRequest = HttpStatus.BAD_REQUEST;
        HttpStatus noContent = HttpStatus.NO_CONTENT;


        if (e.getMessage() == "No value present"){

        }

        ApiException apiException = new ApiException(
                e.getMessage(),
                (e.getMessage() == "Registro não encotrado" ? HttpStatus.NO_CONTENT : HttpStatus.BAD_REQUEST) ,
                ZonedDateTime.now(ZoneId.of("Z")));

        return new ResponseEntity<>(apiException, badRequest);
    }
}
