package com;

import java.util.HashMap;
import java.util.Map;

// Practic section
class Book {
    private String name;
    private String author;
    private String isbn;

    public void setDetails(String name, String author, String isbn) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}

// Practic section
public class HashMapJava {
    // public static void main(String[] args) {
    // HashMap<String, String> hm = new HashMap<>();
    // hm.put("first", "Devv");
    // hm.put("last", "Sakib");

    // hm.remove("first");
    // System.out.println(hm.get("first")); // null
    // System.out.println(hm.get("last").toLowerCase()); // sakib
    // // System.out.println(hm);
    // }

    // Practicing HashMap
    private Map<String, Book> books = new HashMap<>();

    public void addBook(String isbn, String name, String author) {
        Book book = new Book();
        book.setDetails(name, author, isbn);
        books.put(isbn, book);
    }

    public Book getBook(String isbn) {
        return books.get(isbn);
    }

    public static void main(String[] args) {
        HashMapJava collection = new HashMapJava();
        collection.addBook("21373", "A Coder With Zero Knowledge", "DevvSakib");
        collection.addBook("1234567890", "The Catcher in the Rye", "J.D. Salinger");
        // Book b1 = collection.getBook("21232");
        Book book1 = collection.getBook("1234567890");
        Book book2 = collection.getBook("21373");
        if (book1 != null || book2 != null) {
            System.out.println("Book 1: " + book1.getName() + " by " + book1.getAuthor());
            System.out.println("Book 2: " + book2.getName() + " by " + book2.getAuthor());
        } else {
            System.out.println("Book 1 not found.");
        }

    }
    // Practicing HashMap

}
/*
 * n Java, a HashMap is a collection class that allows you to store elements in
 * the form of key-value pairs. It implements the Map interface and is a part of
 * the Java Collections Framework.
 * 
 * 
 * HashMaps are commonly used in Java when you need to store and retrieve
 * elements based on unique keys.
 * 
 * Caching, Indexing, Counting, Grouping,
 * 
 */
// javac -d . HashMapJava.java && java com/HashMapJava