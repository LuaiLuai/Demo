package com.sw.appliction.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "user")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

    @Id
    private long id;

    private String name;

    private int departId;

    private int companyId;

    private String email;

    private int roleId;

    private String password;

    private String employeeId;


    public UserEntity(int companyId, int departmentId, String email, String name, int roleId) {

    }

    public UserEntity(int companyId, int departmentId, String email, String name, String password, int roleId) {
    }

}
