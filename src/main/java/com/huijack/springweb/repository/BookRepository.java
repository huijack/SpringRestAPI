package com.huijack.springweb.repository;

import com.huijack.springweb.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class BookRepository {

    private final List<Book> books = new ArrayList<>(List.of(
            new Book(1001, "Harry Potter", "LOL", "J.K. Rowling", 520.00),
            new Book(1002, "The Hobbit", "LOL", "J.R.R. Tolkien", 300.00),
            new Book(1003, "The Lord of the Rings", "LOL", "J.R.R. Tolkien", 400.00)
    ));

    public List<Book> getBooks() {
        return books;
    }

    public Optional<Book> getBook(int bookId) {
        return books.stream().filter(b -> b.getBookId() == bookId).findFirst();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean updateBook(Book book) {
        return books.stream()
                .filter(b -> b.getBookId() == book.getBookId())
                .findFirst()
                .map(b -> {
                    b.setBookName(book.getBookName());
                    b.setBookDescription(book.getBookDescription());
                    b.setBookAuthor(book.getBookAuthor());
                    b.setBookPrice(book.getBookPrice());
                    return true;
                }).orElse(false);
    }

    public boolean deleteBook(int bookId) {
        return books.removeIf(b -> b.getBookId() == bookId);
    }
}