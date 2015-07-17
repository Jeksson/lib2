package com.jekss.service;

import com.jekss.entity.User;

import java.util.List;

/**
 * Created by Жека on 17.07.2015.
 */
public interface UserService {

    User addUser(User user);
    void delete(int id);
    User getByName(String name);
    User editUser(User user);
    List<User> getAll();
}
