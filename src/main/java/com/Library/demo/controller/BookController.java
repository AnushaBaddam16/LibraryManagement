package com.Library.demo.controller;

import com.Library.demo.entity.Book;
import com.Library.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;
  /*  @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }*/

    @GetMapping("/{bookId}")
    public Book getBookById(@PathVariable Integer bookId) {
        return bookService.getBook(bookId);
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    @PutMapping("/{bookId}")
    public Book updateBook(@PathVariable Integer bookId, @RequestBody Book updatedBook) {
        return bookService.updateBook(bookId, updatedBook);
    }
    @DeleteMapping("/{bookId}")
    public void deleteBook(@PathVariable Integer bookId) {
        bookService.deleteBook(bookId);
    }
}