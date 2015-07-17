package com.jekss.service;

import com.jekss.entity.Book;

import java.util.List;

/**
 * Created by Жека on 17.07.2015.
 */
public interface BookService {

    Book addBook(Book book);
    void delete(int id);
    Book getByName(String name);
    Book editBook(Book book);
    List<Book> getAll();
}
