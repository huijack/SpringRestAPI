package com.huijack.springweb.service;

import com.huijack.springweb.model.Book;
import com.huijack.springweb.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public List<Book> getBooks() {
        return bookRepository.getBooks();
    }

    public Book getBook(int bookId) {
        return bookRepository.getBook(bookId);
    }

    public void addBook(Book book) {
        bookRepository.addBook(book);
    }

    public void updateBook(Book book) {
        bookRepository.updateBook(book);
    }

    public void deleteBook(int bookId) {
        bookRepository.deleteBook(bookId);
    }
}
