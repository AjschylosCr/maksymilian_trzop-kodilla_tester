package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    public List<Book> books = new ArrayList<>();

    public List<Book> createBookList(String title, String author){
        Book tempBook = new Book(title, author);
        if (!books.contains(tempBook)){
            books.add(tempBook);
        } else System.out.println("this book already exist");
        return books;
    }
}
