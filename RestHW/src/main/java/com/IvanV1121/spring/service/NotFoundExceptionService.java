package com.IvanV1121.spring.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundExceptionService extends Exception {
    public NotFoundExceptionService() {
        super("Not found or does not exist!");
    }
}