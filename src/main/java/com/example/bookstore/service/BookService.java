package com.example.bookstore.service;


import com.example.bookstore.model.common.Book;

import java.util.List;

public interface BookService {
    Book getBookById(Long id);// получить книгу по id
    List<Book> getAllBooks();// получить список всех книг
    void addBook(Book book);// добавить книгу
    List<Book> getBooksByAuthor(String author);// найти книги по автору
    void deleteBookById(Long id);
}
