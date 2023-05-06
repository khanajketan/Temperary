package com.BookAndAuthor.Service;

import com.BookAndAuthor.Models.Book;
import com.BookAndAuthor.Repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepo bookRepo;

    public String addBook(Book book){
        String name = book.getName();
        bookRepo.getBookHashMap().put(name,book);
        return "Book added succesfully";
    }

    public String updateBookPages(String name, int pages) {
        if(bookRepo.getBookHashMap().containsKey(name)){
//            Book book = bookRepo.getBookHashMap().get(name);
//            book.setPages(pages);
//            bookRepo.getBookHashMap().put(name, book);
            bookRepo.getBookHashMap().get(name).setPages(pages);
            return "Book updated Succesfully";
        }
        return "Book is Not present";
    }
}
