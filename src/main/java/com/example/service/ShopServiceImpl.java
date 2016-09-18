package com.example.service;

import com.example.entity.Book;
import com.example.exception.BookNotFound;
import com.example.repository.ShopRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Developer on 2016/9/15.
 */
@Service
public class ShopServiceImpl implements ShopService {

    @Resource
    private ShopRepository shopRepository;

    @Override
    @Transactional
    public Book create(Book book) {
        Book createdBook = book;
        return shopRepository.save(createdBook);
    }

    @Override
    @Transactional
    public Book findById(String id) {
        return shopRepository.findOne(id);
    }

    @Override
    @Transactional(rollbackFor=BookNotFound.class)
    public Book delete(String id) throws BookNotFound {
        Book deletedBook = shopRepository.findOne(id);

        if (deletedBook == null)
            throw new BookNotFound();

        shopRepository.delete(deletedBook);
        return deletedBook;
    }

    @Override
    @Transactional
    public List<Book> findAll() {
        return shopRepository.findAll();
    }

    @Override
    @Transactional(rollbackFor=BookNotFound.class)
    public Book update(Book book) throws BookNotFound {
        Book updatedBook = shopRepository.findOne(book.getId());

        if (updatedBook == null)
            throw new BookNotFound();
        updatedBook.copyOfExceptForId(book);
        return updatedBook;
    }

}