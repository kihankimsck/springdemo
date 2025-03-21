package com.example.demo.bisiness.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinessController {

    @GetMapping("/health")
    public ResponseEntity healthCheck() {
        return new ResponseEntity("OK", HttpStatus.OK);
    }
}
