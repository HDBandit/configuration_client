package com.hdbandit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
@RefreshScope
public class ExampleService {
    
    @Value("${message.hello}")
    private String message;

    @RequestMapping(method = RequestMethod.GET)
    public String getExample() {
        return message;
    }
    
}
