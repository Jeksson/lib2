package com.jekss.repository;

import com.jekss.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by Жека on 17.07.2015.
 */
public interface AuthorRepository extends JpaRepository<Author, Integer> {
    @Query("select b from Author b where b.name = :name")
    Author findByName(@Param("name") String name);
}
