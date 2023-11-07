package com.example.springbootactuatordemo.custom;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Endpoint(id ="customendpoint")
@Component
public class CustomEndpoint {
    @ReadOperation
    public String customInfo() {
        return "this is a custom endpoint";
    }
}
