package com.example.api.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<String> test(HttpServletRequest servletRequest){
        return ResponseEntity.ok().body("Test Api");
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello(HttpServletRequest servletRequest){
        return ResponseEntity.ok().body("Hello from Api");
    }
}
