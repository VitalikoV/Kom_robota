package org.example;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Didukh", 5, 3, 4));
        students.add(new Student("Drapak", 5, 5, 5));
        students.add(new Student("Selin", 5, 3, 5));

        StudentController.printStudents(students);
        System.out.println("");
        StudentController.printStudents(StudentController.sortStudentsByAverageMark(students));

        //StudentParser.generateCSVFile(students, "students");
        ArrayList<Student> studsFromCSV = StudentParser.readCSVFile("students.csv");
        for(Student stud : studsFromCSV){
            System.out.println(stud.toString());
        }
    }
}
