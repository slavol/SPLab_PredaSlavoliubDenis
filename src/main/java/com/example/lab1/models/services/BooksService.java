package com.example.lab1.models.services;

import com.example.lab1.models.entities.Book;
import com.example.lab1.models.persistence.BooksRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BooksService {
    private final BooksRepository booksRepository;

    public BooksService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public List<Book> getAllBooks() {
        return booksRepository.findAll();
    }

    public Optional<Book> getBookById(Integer id) {
        return booksRepository.findById(id);
    }

    public Book addBook(Book book) {
        return booksRepository.save(book);
    }

    public Book updateBook(Integer id, Book newBook) {
        return booksRepository.findById(id).map(book -> {
            book.setTitle(newBook.getTitle());
            return booksRepository.save(book);
        }).orElseGet(() -> booksRepository.save(newBook));
    }

    public void deleteBook(Integer id) {
        booksRepository.deleteById(id);
    }
}