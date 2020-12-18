package com.sw.appliction.service;

import com.sw.appliction.dao.UserDao;
import com.sw.appliction.entity.UserEntity;
import com.sw.appliction.model.UserModel;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    private UserDao userDao;

    public UserEntity register(UserModel userModel){
        UserEntity userEntity = new UserEntity(userModel.getCompanyId(),
                userModel.getDepartmentId(),
                userModel.getEmail(),
                userModel.getName(),
                userModel.getRoleId());
        return userDao.save(userEntity);
    }

    private boolean checkPassword(String password, String confirmedPassword) {
        return password.equals(confirmedPassword);
    }


}
