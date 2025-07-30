package com.swagger_openapi.controller;

import com.example.swagger_openapi.api.UsersApi;
import com.example.swagger_openapi.dto.User;
import com.example.swagger_openapi.dto.UserForm;
import com.example.swagger_openapi.dto.UserWeb;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UsersApi {
    @Override
    public ResponseEntity<UserWeb> createUser(UserForm userForm) {
        return UsersApi.super.createUser(userForm);
    }

    @Override
    public ResponseEntity<String> deleteUserById(Long id) {
        return UsersApi.super.deleteUserById(id);
    }

    @Override
    public ResponseEntity<UserWeb> getUserById(Long id) {
        return UsersApi.super.getUserById(id);
    }

    @Override
    public ResponseEntity<User> updateUser(User user) {
        return UsersApi.super.updateUser(user);
    }
}
