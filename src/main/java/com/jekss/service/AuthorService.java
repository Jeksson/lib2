package com.jekss.service;

import com.jekss.entity.Author;

import java.util.List;

/**
 * Created by Жека on 17.07.2015.
 */
public interface AuthorService {

    Author addAutor(Author author);
    void delete(int id);
    Author getByName(String name);
    Author editAuthor(Author author);
    List<Author> getAll();
}
