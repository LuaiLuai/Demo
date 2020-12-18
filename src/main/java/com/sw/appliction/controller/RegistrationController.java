package com.sw.appliction.controller;

import com.sw.appliction.entity.UserEntity;
import com.sw.appliction.model.UserModel;
import com.sw.appliction.service.RegistrationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class RegistrationController {


    @Autowired
    private RegistrationService registrationService;

    @PostMapping(value = "registration")
    public UserEntity register(@RequestBody UserModel userModel) throws Exception {
        return registrationService.register(userModel);
    }

    @GetMapping(value = "/re")
    public void test() {
        System.out.println("enter here");
    }
}
