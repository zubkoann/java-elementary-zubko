package com.zubko.homework.hw_07;

import java.util.Objects;
import java.util.UUID;

public class Library {
    public static void main(String[] args) {
        Author s = new Author("William", "Sheksper");
        Author s1 = new Author("William", "Sheksper");
        Author s2 = new Author("", "Hostmann");
        Author s3 = s2;
        System.out.println("s " + s.hashCode());
        System.out.println("s1 " + s1.hashCode());
        System.out.println("s2 " + s2.hashCode());
        System.out.println("s3 " + s3.hashCode());
        System.out.println("s1 == s  " + s.equals(s1));
        System.out.println("s3 == s2  " + s3.equals(s2));

        Book b1 = new Book();
        Book b2 = new Book("my titile", s);
        Book b3 = new Book("my titile", s);
        System.out.println("b1 " + b1.hashCode());
        System.out.println("b2 " + b2.hashCode());
        System.out.println("b3 " + b3.hashCode());
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println("b1 == b2  " + b1.equals(b2));
        System.out.println("b2 == b3  " + b3.equals(b2));

    }

    private String id = UUID.randomUUID().toString();
    private Book book;


    public Library(Book book) {
        this.book = book;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return id.equals(library.id) &&
                book.equals(library.book);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, book);
    }
}
