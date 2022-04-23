package com.company;

import java.util.*;

public class StudentController {
    public static ArrayList<Student> addStudent(ArrayList<Student> students, String lastName, Integer examMark1,
                                                Integer examMark2, Integer examMark3) throws Exception {
        if(Objects.equals(lastName, "") || lastName.length() > 20){
            throw new Exception("LastName is not correct");
        }

        if(examMark1 < 1 || examMark1 > 5){
            throw new Exception("LastName is not correct");
        }

        if(examMark2 < 1 || examMark2 > 5){
            throw new Exception("LastName is not correct");
        }

        if(examMark3 < 1 || examMark3 > 5){
            throw new Exception("LastName is not correct");
        }

        students.add(new Student(lastName, examMark1, examMark2, examMark3));
        return students;
    }

    public static ArrayList<Student> editStudentInfo(ArrayList<Student> students, String lastNameOfEditedStudent, Integer examMark1,
                                                     Integer examMark2, Integer examMark3){
        for(Student stud : students){
            if(Objects.equals(stud.getLastName(), lastNameOfEditedStudent)){
                stud.setEkzamMark1(examMark1);
                stud.setEkzamMark2(examMark2);
                stud.setEkzamMark3(examMark3);
            }
        }

        return students;
    }

    public static void printStudents(ArrayList<Student> students){
        System.out.println("LastName, Exam Mark 1, Exam Mark 2, Exam Mark 3");
        for(Student stud : students){
            System.out.println(stud.getLastName() + ",      " + stud.getEkzamMark1() + ",        " + stud.getEkzamMark2() + ",        " + stud.getEkzamMark3());
        }
        System.out.println("");

    }
}
