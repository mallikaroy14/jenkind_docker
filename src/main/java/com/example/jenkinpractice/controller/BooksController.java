package com.example.jenkinpractice.controller;

import com.example.jenkinpractice.models.Books;
import com.example.jenkinpractice.services.BooksServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BooksController {

    @Autowired
    BooksServices booksServices;

    @GetMapping("/")
    public List<Books> getAll(){
      return booksServices.getAll();
    }
}
