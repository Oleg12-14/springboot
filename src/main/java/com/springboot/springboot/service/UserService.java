package com.springboot.springboot.service;


import com.springboot.springboot.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    User getUserById(Long id);

    List<User> listUser();

    void deleteUser(Long id);
}
