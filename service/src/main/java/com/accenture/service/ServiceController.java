package com.accenture.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServiceController {

    private static final String template = "Hello, %s!";

    @RequestMapping("/hello")
    public ResponseEntity<String> hello(@RequestParam(value="name", defaultValue="World") String name) {
        return ResponseEntity.ok(String.format(template, name));
    }
}
