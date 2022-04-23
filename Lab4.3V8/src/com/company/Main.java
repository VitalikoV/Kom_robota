package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        String name = reader.readLine();
        name += ".csv";
        ArrayList<Student> students = StudentParser.readCSVFile(name);

//        ArrayList<Student> students = new ArrayList<Student>();
//        students.add(new Student("Didukh", 5, 3, 4));
//        students.add(new Student("Drapak", 5, 5, 5));
//        students.add(new Student("Selin", 5, 3, 5));

        StudentController.printStudents(students);
        StudentController.editStudentInfo(students, "Selin", 5,3,4);
        StudentController.printStudents(students);
        StudentController.addStudent(students, "Smola", 4,4,4);
        StudentController.printStudents(students);
        StudentParser.generateCSVFile(students, "students");

    }
}
