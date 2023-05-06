package com.BookAndAuthor.Controller;

import com.BookAndAuthor.Models.Author;
import com.BookAndAuthor.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {
    @Autowired
    AuthorService authorService;
    //1. Get List of Author who are under a given age Y and have rating greater than X.
    @PostMapping("/addAuthor")
    public String addAuthor(@RequestParam String name, @RequestParam int age, @RequestParam float rating){
        return authorService.addAuthor(name, age, rating);
    }

    @GetMapping("/getAuthorList")
    public List<Author> getAuthorList(@RequestParam int age, @RequestParam float rating){
        return authorService.getAuthorList(age, rating);
    }
}
