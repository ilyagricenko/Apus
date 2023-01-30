package com.booksservice.apus.controller;

import com.booksservice.apus.entity.Book;
import com.booksservice.apus.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {

    @Autowired
    private BookServiceImpl bookService;

    @GetMapping("/home")
    public String home(){

        return "home";
    }

    @GetMapping("/book_add")
    public String addBook() {

        return "book_add";
    }

    @GetMapping("/available_books")
    public String getAllBooks() {

        return "available_books";
    }

    @PostMapping("/save")
    public String addBook(@RequestParam Book book) {

        bookService.saveBook(book);
        return "redirect:/available_books";
    }
}
