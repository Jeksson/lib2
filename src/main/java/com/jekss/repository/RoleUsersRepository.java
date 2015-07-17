package com.jekss.repository;

import com.jekss.entity.RoleUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by Жека on 17.07.2015.
 */
public interface RoleUsersRepository extends JpaRepository<RoleUsers, Integer> {

    @Query("select b from RoleUsers b where b.name = :name")
    RoleUsers findByName(@Param("name") String name);
}
