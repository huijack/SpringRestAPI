package com.huijack.springweb.service;

import com.huijack.springweb.model.Book;
import com.huijack.springweb.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getBooks() {
        return bookRepository.getBooks();
    }

    public Optional<Book> getBook(int bookId) {
        return bookRepository.getBook(bookId);
    }

    public void addBook(Book book) {
        bookRepository.addBook(book);
    }

    public boolean updateBook(Book book) {
        return bookRepository.updateBook(book);
    }

    public boolean deleteBook(int bookId) {
        return bookRepository.deleteBook(bookId);
    }
}