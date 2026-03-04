package com.huijack.springweb;

import com.huijack.springweb.model.Book;
import com.huijack.springweb.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("getBooks")
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @GetMapping("getBook/{id}")
    public Book getBook(@PathVariable int id) {
        return bookService.getBook(id);
    }

    @PostMapping("addBook")
    public Book addBook(@RequestBody Book book) {
        bookService.addBook(book);
        return book;
    }

    @PutMapping("updateBook")
    public Book updateBook(@RequestBody Book book) {
        bookService.updateBook(book);
        return book;
    }

    @DeleteMapping("deleteBook/{id}")
    public String deleteBook(@PathVariable int id) {
        bookService.deleteBook(id);
        return "Book deleted successfully";
    }
}
