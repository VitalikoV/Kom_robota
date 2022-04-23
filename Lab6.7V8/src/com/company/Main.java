package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Write numbers divided by space: ");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        CustomLinkedList list = new CustomLinkedList();
        list.addAll(reader.readLine().split(" "));

        System.out.println("Write number to change: ");
        int numberToChange = Integer.parseInt(reader.readLine());

        System.out.println("Write change value: ");
        int changeVal = Integer.parseInt(reader.readLine());

        list.changeAllOccurrences(numberToChange, changeVal);

        list.printList();



//        //File parsing
//        //FileParser.generateCSVFile(new int[]{1, 2, 3, 5, 5, 5, 6}, 5, 0, "numbers");
//
//        CustomLinkedList list = new CustomLinkedList();
//        list.addAll(FileParser.readNumbersToProcess("numbers.txt"));
//        list.printList();
//
//        int numberToChange = FileParser.readNumberToChange("numbers.txt");
//
//        int changeVal = FileParser.readChangeVal("numbers.txt");
//
//        list.changeAllOccurrences(numberToChange, changeVal);
//        list.printList();
    }
}
