package com.example.demo.model;
import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;


    // Standard Getters and setters
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }
}
