package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

import static com.company.StackCalculator.getFormulaToCalc;

public class Main {

    public static void main(String[] args) throws IOException {

//        Generation of formula file
        FileParser.generateCSVFile("b-a-c/d*a-b*c*d", "formula");

        //Reading of the formula
        String formula = FileParser.getFormulaFromFile("formula.txt");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StackCalculator calc = new StackCalculator();
        System.out.println("Please enter numbers: ");
        System.out.print("a => ");
        String a = String.valueOf(Integer.parseInt(reader.readLine()));
        System.out.print("b => ");
        String b = String.valueOf(Integer.parseInt(reader.readLine()));
        System.out.print("c => ");
        String c = String.valueOf(Integer.parseInt(reader.readLine()));
        System.out.print("d => ");
        String d = String.valueOf(Integer.parseInt(reader.readLine()));


        System.out.println(calc.compute(getFormulaToCalc(formula, a, b, c, d)));

//        V-8

//        Generation of file
//        ArrayList<String> data = new ArrayList<>();
//        data.add("working on the lab");
//        data.add("then testing");
//        data.add("and then done");
//
//        FileParser.generateCSVFile(data, "data");


//        Reading file
//        CustomStackV8 stack = FileParser.getCharsFromFile("data.txt");
//
//        System.out.print("Not sorted stack: ");
//        stack.printValues();
//        CustomStackV8 sortedStack = stack.sort();
//
//        System.out.print("Sorted stack: ");
//        sortedStack.printValues();
//
//        System.out.print("Not sorted stack: ");
//        stack.printValues();

    }

}
