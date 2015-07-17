package com.jekss.repository;

import com.jekss.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by Жека on 17.07.2015.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("select b from User b where b.name = :name")
    User findByName(@Param("name") String name);
}
