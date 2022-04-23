package com.company;

import java.util.ArrayList;

public class NumbersController {
    public static int[] getEvenNumbers(int[] numbers, Boolean isOdd) {
        ArrayList<Integer> processedNumbers = new ArrayList<Integer>();
        for (int number : numbers) {
            if (isOdd) {
                if (number % 2 != 0) {
                    processedNumbers.add(number);
                }
            } else {
                if (number % 2 == 0) {
                    processedNumbers.add(number);
                }
            }
        }

        int[] procNumbers = new int[processedNumbers.toArray().length];
        for (int i = 0; i < processedNumbers.toArray().length; i++) {
            procNumbers[i] = processedNumbers.get(i);
        }
        return procNumbers;
    }
}
