package com.jekss.service.impl;

import com.jekss.entity.User;
import com.jekss.repository.UserRepository;
import com.jekss.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Жека on 17.07.2015.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User addUser(User user) {
        User saveUser = userRepository.saveAndFlush(user);
        return saveUser;
    }

    @Override
    public void delete(int id) {
        userRepository.delete(id);
    }

    @Override
    public User getByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public User editUser(User user) {
        return userRepository.saveAndFlush(user);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
