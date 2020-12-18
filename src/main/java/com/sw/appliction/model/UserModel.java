package com.sw.appliction.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class UserModel {
    private long id;
    private String name;
    private String email;
    private String password;
    private String confirmedPassword;
    private int departmentId;
    private int companyId;
    private int roleId;
}
