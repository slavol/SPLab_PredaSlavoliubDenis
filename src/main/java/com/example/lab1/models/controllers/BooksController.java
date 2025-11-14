package com.example.lab1.models.controllers;

import com.example.lab1.models.entities.Book;
import com.example.lab1.models.services.BooksService;
import com.example.lab1.models.observer.AllBooksSubject;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BooksController {

    private final BooksService booksService;
    private final AllBooksSubject allBooksSubject;

    public BooksController(BooksService booksService, AllBooksSubject allBooksSubject) {
        this.booksService = booksService;
        this.allBooksSubject = allBooksSubject;
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
        Book savedBook = booksService.addBook(book);
        allBooksSubject.add(savedBook);   // 🔔 trimite notificarea SSE!
        return savedBook;
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
