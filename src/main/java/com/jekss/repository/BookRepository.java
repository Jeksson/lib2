package com.jekss.repository;

import com.jekss.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by Жека on 17.07.2015.
 */
public interface BookRepository extends JpaRepository<Book, Integer> {
    @Query("select b from Book b where b.name = :name")
    Book findByName(@Param("name") String name);
}
