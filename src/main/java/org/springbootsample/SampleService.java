package org.springbootsample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

    @Value("${sample.message}")
    private String message;

    public String getMessage() {
        return message;
    }
}