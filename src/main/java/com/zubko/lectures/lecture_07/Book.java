package com.zubko.lectures.lecture_07;

import java.util.UUID;

public class Book {
    private String id;
    private String title;
    private Author author;
    private String year;
    private String description;
    private String isbn;

    {
        id = UUID.randomUUID().toString();
        title = "empty";
        author = new  Author("unknown", "unknown");
        year = "empty";
        description = "empty";
        isbn = "empty";
    }

    public Book() {
    }

    public Book(String title, Author author) {
        this("", title, author, "", "", "");

    }

    public Book(String id, String title, Author author, String year, String description, String isbn) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.description = description;
        this.isbn = isbn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year='" + year + '\'' +
                ", description='" + description + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
