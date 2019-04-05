package com.spring.learning.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ExternalService {
    @Value("${service.url}")
    private String serviceUrl;

    public String getServiceUrl() {
        return serviceUrl;
    }
}
