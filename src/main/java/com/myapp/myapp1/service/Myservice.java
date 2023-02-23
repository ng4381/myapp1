package com.myapp.myapp1.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Myservice {
    @Value("${myapp2.host}")
    private String myapp2host;
    public String getDataFromMyapp2() {
        return "QQQ";
//        RestTemplate restTemplate = new RestTemplate();
////        String myAppUrl = "http://localhost:8082/test";
//        String myAppUrl = myapp2host + ":8082/test";
//        ResponseEntity<String> response = restTemplate.getForEntity(myAppUrl, String.class);
//        return response.getBody();
    }
}
