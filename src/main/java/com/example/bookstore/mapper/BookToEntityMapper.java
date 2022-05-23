package com.example.bookstore.mapper;


import com.example.bookstore.model.common.Book;
import com.example.bookstore.model.repository.BookEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookToEntityMapper {

    BookEntity bookToBookEntity(Book book);
    Book bookEntityToBook(BookEntity bookEntity);
}
