package com.booksservice.apus.service.impl;

import com.booksservice.apus.entity.Book;
import com.booksservice.apus.repo.BookRepo;
import com.booksservice.apus.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepo bookRepo;


    @Override
    public Book saveBook(Book book) {

        return bookRepo.save(book);
    }
}
