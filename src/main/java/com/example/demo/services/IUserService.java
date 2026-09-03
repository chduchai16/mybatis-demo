package com.example.demo.services;

import com.example.demo.models.User;

public interface IUserService {
    User findUserById(Long id);
}
