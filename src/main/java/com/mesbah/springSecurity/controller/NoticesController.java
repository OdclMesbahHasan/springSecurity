package com.mesbah.springSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {
    @GetMapping("/notices")
    public String welcome() {
        return "Welcome to Spring Security(Not Authenticated)";
    }

}
