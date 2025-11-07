package com.example.lab1.models.controllers;

import com.example.lab1.models.commands.*;
import com.example.lab1.models.services.BooksService;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/books")
public class BooksController {

    private final BooksService booksService;

    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }

    @GetMapping
    public List<String> getAllBooks() {
        CommandContext context = new CommandContext(booksService, null, null);
        return (List<String>) new GetAllBooksCommand(context).execute();
    }

    @GetMapping("/{id}")
    public Object getBookById(@PathVariable int id) {
        CommandContext context = new CommandContext(booksService, null, id);
        return new GetBookByIdCommand(context).execute();
    }

    @PostMapping
    public Object createBook(@RequestBody String title) {
        CommandContext context = new CommandContext(booksService, title, null);
        return new CreateBookCommand(context).execute();
    }

    @PutMapping("/{id}")
    public Object updateBook(@PathVariable int id, @RequestBody String title) {
        CommandContext context = new CommandContext(booksService, title, id);
        return new UpdateBookCommand(context).execute();
    }

    @DeleteMapping("/{id}")
    public Object deleteBook(@PathVariable int id) {
        CommandContext context = new CommandContext(booksService, null, id);
        return new DeleteBookCommand(context).execute();
    }
}