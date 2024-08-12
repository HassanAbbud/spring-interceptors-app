package com.hassan.springboot.app.interceptor.springboot_interceptor.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/app")
public class AppController {

    @GetMapping("/test")
    public Map<String, String> test() {
        return Collections.singletonMap("message", "test handler controller");
    }
    
    @GetMapping("/test2")
    public Map<String, String> test2() {
        return Collections.singletonMap("message", "test2 handler controller");
    }
    
    @GetMapping("/test3")
    public Map<String, String> test3() {
        return Collections.singletonMap("message", "test3 handler controller");
    }
}
