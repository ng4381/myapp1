package com.myapp.myapp1.controller;

import com.myapp.myapp1.service.Myservice;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class MyController {
    private final Myservice myservice;

    public MyController(Myservice myservice) {
        this.myservice = myservice;
    }

    @GetMapping
    public ResponseEntity<String> test() {
        return ResponseEntity.ok(myservice.getDataFromMyapp2());
    }
}