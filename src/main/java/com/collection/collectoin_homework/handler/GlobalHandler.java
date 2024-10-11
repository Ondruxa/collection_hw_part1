package com.collection.collectoin_homework.handler;

import com.collection.collectoin_homework.exceptions.GlobalException;
import com.collection.collectoin_homework.model.ErrorDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalHandler {
    @ExceptionHandler(GlobalException.class)
    public ResponseEntity<?> handleGlobalException(GlobalException exception) {
        ErrorDetails errorDetails = new ErrorDetails(exception.getMessage(), exception.getHttpStatus().value());
        return new ResponseEntity<>( errorDetails, exception.getHttpStatus());
    }

}
