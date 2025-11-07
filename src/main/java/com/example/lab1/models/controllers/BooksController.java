package com.example.lab1.models.controllers;

import com.example.lab1.models.entities.Book;
import com.example.lab1.models.services.BooksService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BooksController {

    private final BooksService booksService;

    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return booksService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Optional<Book> getBookById(@PathVariable Integer id) {
        return booksService.getBookById(id);
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return booksService.addBook(book);
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Integer id, @RequestBody Book book) {
        return booksService.updateBook(id, book);
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Integer id) {
        booksService.deleteBook(id);
        return "Book deleted successfully!";
    }
}