package com.example.demo.exception;

import org.openapitools.model.Error;

public class UnlikeNameException extends RuntimeException {
    private Error error;

    public UnlikeNameException(String mess) {
        error.code("code").message(mess);
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }
}
