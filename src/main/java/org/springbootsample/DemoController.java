package org.springbootsample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class DemoController {
    @Autowired
    private SampleService sampleService;

    @GetMapping
    public String getGreeting() {
        return sampleService.getMessage();
    }

}

