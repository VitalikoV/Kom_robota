package com.company;

import java.util.List;
import java.util.Map;

public class Student {
    private Integer number;
    private final String firstName;
    private final String lastName;
    private List<Subject> subjectList;
    private Map<Subject, Mark> subjectToMark;



    public Student(Integer number, String firstName, String lastName, List<Subject> subjectList, Map<Subject, Mark> subjectToMark) {
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjectList = subjectList;
        this.subjectToMark = subjectToMark;
    }


    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    public Map<Subject, Mark> getSubjectToMark() {
        return subjectToMark;
    }

    public void setSubjectToMark(Map<Subject, Mark> subjectToMark) {
        this.subjectToMark = subjectToMark;
    }

}
