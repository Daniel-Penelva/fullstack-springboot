package com.api.demo_fullstack_springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    // http://localhost:8080/
    @GetMapping("/")
    public String testController() {
        return "Testando rest controller";
    }

}
