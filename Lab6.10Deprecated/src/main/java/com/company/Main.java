package main.java.com.company;//package com.company;

import java.io.IOException;
import com.company.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws IOException {
        Date today = new Date();
        Date lastYear = new Date();
        lastYear.setYear(2021);
        Date january = new Date();
        january.setMonth(1);

        File firstFile = new File("", today);
        File secondFile = new File("", lastYear);
        File thirdFile = new File("", january);

        //int[] numbers = FileParser.readNumbersToProcess("numbers.txt");

        BinaryTree tree = new BinaryTree();
        tree.add(firstFile);
        tree.add(secondFile);
        tree.add(thirdFile);


        tree.printTree();
    }
}
