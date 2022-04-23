package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExecutionFacade {
    public static void processData() throws IOException {
        System.out.println("Write numbers divided by space for the first list: ");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        CustomLinkedList list = new CustomLinkedList();
        list.addAll(reader.readLine().split(" "));

        FileParser.generateCSVFile(list, "numbers");

        System.out.println("Write numbers divided by space for the second list: ");
        BufferedReader secondReader = new BufferedReader(
                new InputStreamReader(System.in));

        CustomLinkedList listToCompare = new CustomLinkedList();
        listToCompare.addAll(secondReader.readLine().split(" "));

        FileParser.generateCSVFile(listToCompare, "numbersToCompare");

        Boolean isListsAreIdentical = list.compare(listToCompare);
        System.out.println("Lists are identical: " + isListsAreIdentical);

        CustomLinkedList resultList = list.getCompareList(listToCompare);
        resultList.printList();

    }
}
