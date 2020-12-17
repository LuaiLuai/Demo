package com.sw.appliction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationController {

    @GetMapping(value = "/registration")
    public String register(){
       System.out.println("enter here");
       return "jkldsfj";
    }
}
