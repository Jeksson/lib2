package com.jekss.service;

import com.jekss.entity.RoleUsers;

import javax.management.relation.Role;
import java.util.List;

/**
 * Created by Жека on 17.07.2015.
 */
public interface RoleUsersService {

    RoleUsers addRole(RoleUsers role);
    void delete(int id);
    RoleUsers getByName(String name);
    RoleUsers editRole(RoleUsers role);
    List<RoleUsers> getAll();
}
