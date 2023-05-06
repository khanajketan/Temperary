package com.BookAndAuthor.Repository;

import com.BookAndAuthor.Models.Author;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@Repository
public class AuthorRepo {
    private HashMap<String, Author> authorHashMap = new HashMap<>();

    public HashMap<String, Author> getAuthorHashMap() {
        return authorHashMap;
    }
}
