package com.jekss.service.impl;

import com.jekss.entity.Author;
import com.jekss.repository.AuthorRepository;
import com.jekss.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Жека on 17.07.2015.
 */
@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public Author addAutor(Author author) {
        Author savedAuthor = authorRepository.saveAndFlush(author);
        return savedAuthor;
    }

    @Override
    public void delete(int id) {
        authorRepository.delete(id);
    }

    @Override
    public Author getByName(String name) {
        return authorRepository.findByName(name);
    }

    @Override
    public Author editAuthor(Author author) {
        return authorRepository.saveAndFlush(author);
    }

    @Override
    public List<Author> getAll() {
        return authorRepository.findAll();
    }
}
