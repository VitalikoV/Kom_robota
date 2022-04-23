package com.company;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Course {
    private String courseName;
    private List<Student> students;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Course(String courseName, List<Student> students) {
        this.students = students;
        this.courseName = courseName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addSubjectForAllStudents(Subject subject) {
        for (Student student : students) {
            student.getSubjectList().add(subject);
            student.getSubjectToMark().put(subject, new Mark(0));
        }
    }

    public void showAllStudentsInfo() {
        System.out.println("Course: " + courseName);
        System.out.format("%-3s %-15s %-15s", "№", "FirstName", "LastName");
        for(Subject subj : students.get(0).getSubjectList()){
            System.out.format("%-20s", subj.getName());
        }
        System.out.println();
        for (Student student : students) {
            System.out.println();
            System.out.format("%-3s %-15s %-15s", student.getNumber(), student.getFirstName(), student.getLastName());
            for (Subject subject : student.getSubjectList()) {
                System.out.format("%-20s", student.getSubjectToMark().get(subject).getDefinedMark());
            }
            System.out.println();
        }
    }

    public Map<Subject, Integer> getQuantityWithGoodMark() {
        Map<Subject, Integer> subjectToQuantity = new HashMap<>();

        for (Student student : students) {
            Map<Subject, Mark> studentMarks = student.getSubjectToMark();
            for (Subject subject : studentMarks.keySet()) {
                Mark mark = studentMarks.get(subject);
                if (mark.getDefinedMark() == 4) {
                    if (subjectToQuantity.containsKey(subject)) {
                        Integer tempQuantity = subjectToQuantity.get(subject);
                        subjectToQuantity.put(subject, tempQuantity + 1);
                    } else {
                        subjectToQuantity.put(subject, 1);
                    }
                }
            }
        }
        return subjectToQuantity;
    }

    public double calculatePercentageOfStudentsWithDefMarks() {
        double percentage;
        int quantityOfStudents = 0;

        for (Student student : students) {
            Map<Subject, Mark> studentMarks = student.getSubjectToMark();
            Subject physics = null, math = null;
            for (Subject subject : studentMarks.keySet()) {
                if (Objects.equals(subject.getName(), "Physics")) {
                    physics = subject;
                }

                if (Objects.equals(subject.getName(), "Math")) {
                    math = subject;
                }
            }

            if (studentMarks.get(physics).getDefinedMark() == 5 && studentMarks.get(math).getDefinedMark() == 5) {
                quantityOfStudents += 1;
            }
        }

        percentage = (quantityOfStudents * 100/ students.size());
        return percentage;
    }

}
