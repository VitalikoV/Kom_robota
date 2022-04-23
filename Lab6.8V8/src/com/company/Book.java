package com.company;

public class Book {
    private String name;
    private String genre;
    private Boolean isAvailable;
    private int pagesQuantity;

    public Book(String name, String genre, Boolean isAvailable, int pagesQuantity) {
        this.name = name;
        this.genre = genre;
        this.isAvailable = isAvailable;
        this.pagesQuantity = pagesQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public int getPagesQuantity() {
        return pagesQuantity;
    }

    public void setPagesQuantity(int pagesQuantity) {
        this.pagesQuantity = pagesQuantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", isAvailable=" + isAvailable +
                ", pagesQuantity=" + pagesQuantity +
                '}';
    }
}
