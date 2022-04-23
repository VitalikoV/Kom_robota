package org.example;

public class ExecutionFacade {
    public static void processData(){
//        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        FileParser.generateCSVFile(number, "numbers");

        CustomQueue queue = FileParser.readCSVFile("numbers.txt");
        System.out.println("Biggest element: " + queue.getSmallestElem() + ", his position: " + queue.getSmallestElemPos());
        System.out.println("Biggest element: " + queue.getBiggestElem() + ", his position: " + queue.getBiggestElemPos());
    }
}
