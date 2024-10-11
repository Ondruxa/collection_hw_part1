package com.collection.collectoin_homework.exceptions;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

//@ResponseStatus(value = BAD_REQUEST, reason = "Storage is full")
public class EmployeeStorageIsFullException extends GlobalException {
    public EmployeeStorageIsFullException(String message) {
        super(message, BAD_REQUEST);
    }
}
