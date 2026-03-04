package com.huijack.springweb.model;

public class Book {

    private int bookId;
    private String bookName;
    private String bookDescription;
    private String bookAuthor;
    private double bookPrice;

    public Book() {}

    public Book(int bookId, String bookName, String bookDescription, String bookAuthor, double bookPrice) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookDescription = bookDescription;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
    }

    // Getters and Setters
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }
}
