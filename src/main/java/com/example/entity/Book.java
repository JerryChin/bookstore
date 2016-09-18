package com.example.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Developer on 2016/9/14.
 */
@Entity
@Table(name = "books")
public class Book {
    public Book(){};   // let's be merciful to reflection.

    public void copyOfExceptForId(Book other) {
        this.id = other.id;
        this.author = other.author;
        this.title = other.title;
        this.genre = other.genre;
        this.price = other.price;
        this.publishDate = other.publishDate;
        this.description = other.description;
    }

    @Id
    private String id;

    @Column
    private String author;

    @Column
    private String title;

    @Column
    private String genre;

    @Column
    private float price;

    @Column(name = "publish_date")
    private String publishDate;

    @Column
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getPublishDate() { return publishDate; }

    public void setPublishDate(String publishDate) { this.publishDate = publishDate; }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
