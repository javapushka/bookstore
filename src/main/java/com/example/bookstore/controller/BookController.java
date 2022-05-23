package com.example.bookstore.controller;


import com.example.bookstore.mapper.BookToDtoMapper;
import com.example.bookstore.model.common.Book;
import com.example.bookstore.model.dto.BookRequestDto;
import com.example.bookstore.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;
    private final BookToDtoMapper mapper;

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    @GetMapping()
    public List<Book> getAllBooks(@RequestParam(required = false) String author) {
        if (author != null) {
            return bookService.getBooksByAuthor(author);
        }
        return bookService.getAllBooks();
    }

    @PostMapping
    public void saveBook(@RequestBody BookRequestDto bookRequestDto) {
        bookService.addBook(mapper.addBookRequestToBook(bookRequestDto));
    }

    @GetMapping("/delete/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBookById(id);
    }

}
