package com.example.config;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TimeProvider {

    public Date now() {
        return new Date();
    }
}
