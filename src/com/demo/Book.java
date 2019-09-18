package com.demo;

import java.util.Objects;

public class Book extends Product {

    private String title;
    private String author;
    private int pages;

    // equals method to compare to books
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Book)) {
            return false;
        }
        Book book = (Book) o;
        return Objects.equals(title, book.title);
    }
    public String toString(){
        return "This is " + author + "'s book. It  has " + pages + "pages";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

}
