package com.booksservice.apus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

    @GetMapping("/home")
    public String home(){

        return "home";
    }

    @GetMapping("/book_add")
    public String addBook() {

        return "book_add";
    }
}
