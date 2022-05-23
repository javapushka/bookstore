package com.example.bookstore.mapper;

import com.example.bookstore.model.common.Book;
import com.example.bookstore.model.dto.BookRequestDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookToDtoMapper {
    Book addBookRequestToBook(BookRequestDto bookRequestDto);
}
