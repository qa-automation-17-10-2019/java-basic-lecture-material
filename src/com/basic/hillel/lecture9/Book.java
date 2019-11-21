package com.basic.hillel.lecture9;

/**
 * Created by alpa on 11/14/19
 */
public class Book {

    private long id;
    private String title;
    private int year;
    private Author author;

    public Book() { }

    public Book(long id, String title, int year, Author author) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", author=" + author +
                '}';
    }
}
