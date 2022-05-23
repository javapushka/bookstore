package com.example.bookstore.model.dto;

import lombok.Data;


@Data
public class BookRequestDto {
    private String author;
    private String title;
    private Double price;
}
