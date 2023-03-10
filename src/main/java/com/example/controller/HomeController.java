package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api/v1/jwt")
public class HomeController {

    @GetMapping("/hello")
    public String helloJwt(Principal principal){
        return "Hello " + principal.getName() +" from JWT..!!";
    }
}
