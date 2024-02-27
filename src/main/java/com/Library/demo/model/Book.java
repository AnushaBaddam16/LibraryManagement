package com.Library.demo.model;

public class Book {

    private Integer bookId;
    private String title;
    private String author;
    private String isbn;
    private double price;
    private Integer year_published;
    private Integer quantity;

    private String genre;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getYear_published() {
        return year_published;
    }

    public void setYear_published(Integer year_published) {
        this.year_published = year_published;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}