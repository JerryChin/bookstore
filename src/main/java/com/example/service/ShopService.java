package com.example.service;

import com.example.entity.Book;
import com.example.exception.BookNotFound;

import java.util.List;

/**
 * Created by Developer on 2016/9/15.
 */
public interface ShopService {

    public Book create(Book shop);
    public Book delete(String id) throws BookNotFound;
    public List<Book> findAll();
    public Book update(Book shop) throws BookNotFound;
    public Book findById(String id);

}