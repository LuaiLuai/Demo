package com.sw.appliction.controller;

import com.sw.appliction.model.User;
import com.sw.appliction.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping(value = "registration")
    public void register(@RequestBody User user) {
        System.out.println("enter here");
        registrationService.register(user);
    }

    @GetMapping(value = "/re")
    public void test() {
        System.out.println("enter here");
    }


}
