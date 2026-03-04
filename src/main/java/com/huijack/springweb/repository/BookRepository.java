package com.huijack.springweb.repository;

import com.huijack.springweb.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository {

    List<Book> books = new ArrayList<>(List.of(
            new Book(1001, "Harry Potter", "LOL", "J.K. Rowling", 520.00),
            new Book(1002, "The Hobbit", "LOL", "J.R.R. Tolkien", 300.00),
            new Book(1003, "The Lord of the Rings", "LOL", "J.R.R. Tolkien", 400.00)
    ));

    public List<Book> getBooks() {
        return books;
    }

    public Book getBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void updateBook(Book book) {
        for (Book b : books) {
            if (b.getBookId() == book.getBookId()) {
                b.setBookName(book.getBookName());
                b.setBookDescription(book.getBookDescription());
                b.setBookAuthor(book.getBookAuthor());
                b.setBookPrice(book.getBookPrice());
            }
        }
    }

    public void deleteBook(int bookId) {
        books.removeIf(book -> book.getBookId() == bookId);
    }
}