package com.sw.appliction.dao;

import com.sw.appliction.entity.UserEntity;
import com.sw.appliction.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDao {

    @Autowired
    public UserRepository userRepository;

    public UserEntity save(UserEntity userEntity){
        return userRepository.save(userEntity);
    }


}
