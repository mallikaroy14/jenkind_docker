package com.example.jenkinpractice.services;

import com.example.jenkinpractice.models.Books;
import com.example.jenkinpractice.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksServices {

    @Autowired
    BooksRepository booksRepository;

    public List<Books> getAll(){
      return  booksRepository.findAll();
    }
}
