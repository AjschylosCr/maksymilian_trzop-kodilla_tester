package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        bookManager.createBookList("Doctor Zhyvago", "Boris Pasternak");
        bookManager.createBookList("DOctor Zhyvago", "Boris Pasternak");
        bookManager.createBookList("DOctor Zhyvago", "Boris Pasternak");
        bookManager.createBookList("Doctor Zhyvago", "Boris Pasternak");
        System.out.println(bookManager.books.size());
        for (int i = 0; i<bookManager.books.size(); i++){
            System.out.println(bookManager.books.get(i).hashCode());
        }
    }
}
