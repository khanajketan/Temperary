package com.BookAndAuthor.Repository;

import com.BookAndAuthor.Models.Book;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class BookRepo {
    private HashMap<String, Book> bookHashMap = new HashMap<>();

    public HashMap<String, Book> getBookHashMap() {
        return bookHashMap;
    }
}
