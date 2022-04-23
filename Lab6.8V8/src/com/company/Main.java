package com.company;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
//        CustomTwoLinkedList books = new CustomTwoLinkedList();
//        books.addElement(new Book("Thinking - Fast and Slow", "Psychology", true, 200));
//        books.addElement(new Book("1984", "Fiction", true, 350));
//        books.addElement(new Book("The last thing he told me", "Fiction", false, 120));
//        books.addElement(new Book("Brave new world", "Novel", true, 100));
//
//        BookParser.generateCSVFile(books, "books");

        CustomTwoLinkedList books = BookParser.readCSVFile("books.csv");
        books.printNodes();

        Book searchedBook = books.searchByName("1984");
        System.out.println(searchedBook.toString());

        books.delete("Brave new world");
        books.printNodes();
    }
}
