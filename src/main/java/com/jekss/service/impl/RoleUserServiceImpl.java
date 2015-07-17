package com.jekss.service.impl;

import com.jekss.repository.RoleUsersRepository;
import com.jekss.service.RoleUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jekss.entity.RoleUsers;

import java.util.List;

/**
 * Created by Жека on 17.07.2015.
 */
@Service
public class RoleUserServiceImpl implements RoleUsersService {

    @Autowired
    RoleUsersRepository roleUsersRepository;

    @Override
    public RoleUsers addRole(RoleUsers role) {
        RoleUsers saveRole = roleUsersRepository.saveAndFlush(role);
        return saveRole;
    }

    @Override
    public void delete(int id) {
        roleUsersRepository.delete(id);
    }

    @Override
    public RoleUsers getByName(String name) {
        return roleUsersRepository.findByName(name);
    }

    @Override
    public RoleUsers editRole(RoleUsers role) {
        return roleUsersRepository.saveAndFlush(role);
    }

    @Override
    public List<RoleUsers> getAll() {
        return roleUsersRepository.findAll();
    }
}
