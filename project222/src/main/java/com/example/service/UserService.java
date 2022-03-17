package com.example.service;


import com.example.project222.model.User;

import java.util.List;

public interface UserService {

    List<User> findAllUsers();

    User findById(Long id);

    User saveUser(User user);

    void deleteUser(Long id);
}
