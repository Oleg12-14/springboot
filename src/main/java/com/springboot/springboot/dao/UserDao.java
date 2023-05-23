package com.springboot.springboot.dao;


import com.springboot.springboot.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    User getUserById(Long id);

    List<User> listUser();

    void deleteUser(Long id);

}
