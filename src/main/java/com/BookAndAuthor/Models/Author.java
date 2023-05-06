package com.BookAndAuthor.Models;

public class Author {
    String name;
    float rating;
    int age;

    public Author(String name, float rating, int age) {
        this.name = name;
        this.rating = rating;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
