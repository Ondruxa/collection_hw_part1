package com.collection.collectoin_homework.model;

public class ErrorDetails {
    private String error;
    private int status;

    public ErrorDetails(String error, int status) {
        this.error = error;
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public int getStatus() {
        return status;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
