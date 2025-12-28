package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    public Book saveBook(Book book) {
        // Test validation
        if (book.getTitle() == null || book.getTitle().isEmpty()) {
            throw new RuntimeException("Book title cannot be empty!");
        }
        return repository.save(book);
    }
}