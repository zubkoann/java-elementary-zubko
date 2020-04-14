package com.zubko.homework.hw_07;

import java.util.Objects;
import java.util.UUID;

public class Book {
    private String id = UUID.randomUUID().toString();
    private String title;
    private Author author;
    private String year;
    private String description;
    private String isbn;

    {
        title = "empty";
        author = new  Author("unknown", "unknown");
        year = "empty";
        description = "empty";
        isbn = "empty";
    }

    public Book() {
    }

    public Book(String title, Author author) {
        this( title, author, "", "", "");

    }
    public Book(String title, Author author, String year) {
        this( title, author, year, "", "");
    }
    public Book(String title, Author author, String year, String description) {
        this( title, author, year, description, "");
    }

    public Book( String title, Author author, String year, String description, String isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.description = description;
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return  title.equals(book.title) &&
                author.equals(book.author) &&
                year.equals(book.year) &&
                isbn.equals(book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash( title, author, year, isbn);
    }

    public String getId() {
        return id;
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
