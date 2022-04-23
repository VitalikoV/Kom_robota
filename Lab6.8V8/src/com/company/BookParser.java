package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class BookParser {
    public static CustomTwoLinkedList readCSVFile(String fileName){
        CustomTwoLinkedList books = new CustomTwoLinkedList();
        Path pathToFile = Paths.get(fileName);
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {
            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(",");
                Book book = createBook(attributes);
                books.addElement(book);
                line = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return books;
    }

    public static Book createBook(String[] metadata){
        String name = metadata[0];
        String genre = metadata[1];
        Boolean isAvailable = Boolean.parseBoolean(metadata[2]);
        Integer pagesQuantity = Integer.parseInt(metadata[3]);
        return new Book(name, genre, isAvailable, pagesQuantity);

    }

    public static void generateCSVFile(CustomTwoLinkedList books, String fileName) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName + ".csv"), "UTF-8"));

        CustomNode current = books.getHead();

        while (current != null) {
            Book book = current.value;
            StringBuffer data = new StringBuffer();
            data.append(book.getName()).append(",").append(book.getGenre()).append(",").append(book.getAvailable()).append(",").append(book.getPagesQuantity());
            bw.write(data.toString());
            bw.newLine();
            current = current.next;
        }

        bw.flush();
        bw.close();
    }
}
