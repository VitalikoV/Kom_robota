package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Subject math = new Subject("Math", 5);
        Subject prog = new Subject("Programming", 5);
        Subject physics = new Subject("Physics", 5);
        Subject pedagogy = new Subject("Pedagogy", 5);
        Subject extra = new Subject("Extracurricular Activities", 5);

        List<Subject> subjects = List.of(math, prog, pedagogy, physics, extra );

        Map<Subject, Mark> stud1Marks = new HashMap<Subject, Mark>(){{
            put(math, new Mark(4));
            put(prog, new Mark(4));
            put(pedagogy, new Mark(5));
            put(physics, new Mark(5));
            put(extra, new Mark(5));
        }};

        Map<Subject, Mark>  stud2Marks = new HashMap<Subject, Mark>(){{
            put(math, new Mark(5));
            put(prog, new Mark(4));
            put(pedagogy, new Mark(0));
            put(physics, new Mark(5));
            put(extra, new Mark(4));
        }};

        Map<Subject, Mark>  stud3Marks = new HashMap<Subject, Mark>(){{
            put(math, new Mark(5));
            put(prog, new Mark(5));
            put(pedagogy, new Mark(0));
            put(physics, new Mark(5));
            put(extra, new Mark(3));
        }};

        Student stud1 = new Student(1,  "Vitalii", "Drapak", subjects, stud1Marks);
        Student stud2 = new Student(2, "Artem", "Derid", subjects, stud2Marks);
        Student stud3 = new Student(3, "Anna", "Didukh", subjects, stud3Marks);

        Course course = new Course("IT-13", List.of(stud1, stud2, stud3));
        course.showAllStudentsInfo();
        Map<Subject, Integer> subjInfo = course.getQuantityWithGoodMark();

        System.out.println("Quantity of 5 mark for the subjects: ");
        for(Subject subj : subjInfo.keySet()){
            System.out.println("Subject name: " + subj.getName() + ", mark: " + subjInfo.get(subj));
        }

        System.out.println();
        System.out.println("Percentage of students that have 5 from Physics and Math: " + course.calculatePercentageOfStudentsWithDefMarks() + "%");
    }
}
