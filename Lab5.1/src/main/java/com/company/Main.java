package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        FileParser.generateCSVFile(number, "numbers");

        int[] evenNumbers = NumbersController.getEvenNumbers(number, false);
        int[] oddNumbers = NumbersController.getEvenNumbers(number, true);

        FileParser.generateCSVFile(evenNumbers, "evenNumbers");
        FileParser.generateCSVFile(oddNumbers, "oddNumbers");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the name of the file with the even numbers => ");
        String evenNumbsFileName = reader.readLine();
        evenNumbsFileName += ".txt";

        System.out.print("Enter the name of the file with the odd numbers => ");
        String oddNumbsFileName = reader.readLine();
        oddNumbsFileName += ".txt";


        int[] receivedEvenNumbers = FileParser.readCSVFile(evenNumbsFileName);
        int[] receivedOddNumbers = FileParser.readCSVFile(oddNumbsFileName);

        System.out.println("Even Numbers: " + Arrays.toString(receivedEvenNumbers));
        System.out.println("Odd Numbers: " + Arrays.toString(receivedOddNumbers));

    }
}
