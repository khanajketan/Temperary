package com.BookAndAuthor.Service;

import com.BookAndAuthor.Models.Author;
import com.BookAndAuthor.Repository.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorService {
    @Autowired
    AuthorRepo authorRepo;

    public String addAuthor(String name, int age, float rating){
        Author author = new Author(name,rating,age);
        authorRepo.getAuthorHashMap().put(name,author);
        return "Author added Succesfully";
    }
    public List<Author> getAllAuthor(){
        List<Author> list = new ArrayList<>();

        for(String name: authorRepo.getAuthorHashMap().keySet()){
            list.add(authorRepo.getAuthorHashMap().get(name));
        }
        return list;
    }
    public List<Author> getAuthorList(int age, float rating) {
        List<Author> list = getAllAuthor();
        List<Author> ans = new ArrayList<>();
        for(Author author: list){
            if(author.getAge() < age && author.getRating() > rating) ans.add(author);
        }
        return ans;
    }


}
