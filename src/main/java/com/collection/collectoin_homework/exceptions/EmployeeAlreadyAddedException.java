package com.collection.collectoin_homework.exceptions;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

//@ResponseStatus(BAD_REQUEST)
public class EmployeeAlreadyAddedException extends GlobalException {
    public EmployeeAlreadyAddedException(String message) {
        super(message, BAD_REQUEST);
    }
}
