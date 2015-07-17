package com.jekss.service.impl;

import com.jekss.entity.Book;
import com.jekss.repository.BookRepository;
import com.jekss.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Жека on 17.07.2015.
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;
    @Override
    public Book addBook(Book book) {
        Book saveBook = bookRepository.saveAndFlush(book);
        return saveBook;
    }

    @Override
    public void delete(int id) {
        bookRepository.delete(id);
    }

    @Override
    public Book getByName(String name) {
        return bookRepository.findByName(name);
    }

    @Override
    public Book editBook(Book book) {
        return bookRepository.saveAndFlush(book);
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }
}
