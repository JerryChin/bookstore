package com.example.repository;

import com.example.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Developer on 2016/9/15.
 */
public interface ShopRepository extends JpaRepository<Book, String> {

}