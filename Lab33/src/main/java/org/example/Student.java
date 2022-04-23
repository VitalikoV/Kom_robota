package org.example;

public class Student {
    private String lastName;
    private Integer ekzamMark1;
    private Integer ekzamMark2;
    private Integer ekzamMark3;

    public Student(String lastName, Integer ekzamMark1, Integer ekzamMark2, Integer ekzamMark3) {
        this.lastName = lastName;
        this.ekzamMark1 = ekzamMark1;
        this.ekzamMark2 = ekzamMark2;
        this.ekzamMark3 = ekzamMark3;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getEkzamMark1() {
        return ekzamMark1;
    }

    public void setEkzamMark1(Integer ekzamMark1) {
        this.ekzamMark1 = ekzamMark1;
    }

    public Integer getEkzamMark2() {
        return ekzamMark2;
    }

    public void setEkzamMark2(Integer ekzamMark2) {
        this.ekzamMark2 = ekzamMark2;
    }

    public Integer getEkzamMark3() {
        return ekzamMark3;
    }

    public void setEkzamMark3(Integer ekzamMark3) {
        this.ekzamMark3 = ekzamMark3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", ekzamMark1=" + ekzamMark1 +
                ", ekzamMark2=" + ekzamMark2 +
                ", ekzamMark3=" + ekzamMark3 +
                '}';
    }
}
