package com.BookAndAuthor.Controller;

import com.BookAndAuthor.Models.Book;
import com.BookAndAuthor.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {
    @Autowired
    BookService bookService;
    //2. Given bookname B and no of pages X, Update the no of pages in that book
    @PostMapping("/addBook")
    public String addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    //@PostMapping
    //@GetMapping
    //@PutMapping
    //@DeleteMapping

    @PutMapping("/updateBookPages")
    public String updateBookPages(@RequestParam String name, @RequestParam int pages){
        return bookService.updateBookPages(name, pages);
    }


}
