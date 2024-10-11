package com.collection.collectoin_homework.exceptions;

import static org.springframework.http.HttpStatus.NOT_FOUND;

//@ResponseStatus(value = NOT_FOUND, reason = "Employee is not found")
public class EmployeeNotFoundException extends GlobalException {
    public EmployeeNotFoundException(String message) {
        super(message, NOT_FOUND);
    }
}
