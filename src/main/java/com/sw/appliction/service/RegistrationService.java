package com.sw.appliction.service;

import com.sw.appliction.model.User;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    public void register(User user){
        System.out.println(user.id);
    }
}
