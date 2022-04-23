package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        String name = reader.readLine();
        name += ".csv";
        ArrayList<Student> students = StudentParser.readCSVFile(name);

//        ArrayList<Student> students = new ArrayList<Student>();
//        students.add(new Student("Didukh", 5, 3, 4));
//        students.add(new Student("Drapak", 5, 5, 5));
//        students.add(new Student("Selin", 5, 3, 5));
//        StudentParser.generateCSVFile(students, "students");

    }
}
