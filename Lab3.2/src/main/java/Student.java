import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Student {
    private Integer number;
    private final String firstName;
    private final String lastName;
    private String course;
    private double averageMark;
    private List<Subject> subjectList;
    private Map<Subject, Mark> subjectToMark;


    public Student(Integer number, String firstName, String lastName, String course, List<Subject> subjectList, Map<Subject, Mark> subjectToMark) {
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.subjectList = subjectList;
        this.subjectToMark = subjectToMark;

        for(Subject subj : subjectToMark.keySet()){
            averageMark += subjectToMark.get(subj).getDefinedMark();
        }
        averageMark = averageMark/subjectToMark.size();
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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
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

        for(Subject subj : subjectToMark.keySet()){
            averageMark += subjectToMark.get(subj).getDefinedMark();
        }
        averageMark = averageMark/subjectToMark.size();
    }

    public double getAverageMark() {
        return averageMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", course='" + course + '\'' +
                ", averageMark=" + averageMark +
                ", subjectList=" + subjectList +
                ", subjectToMark=" + subjectToMark +
                '}';
    }

    static class StudentComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return (o1.averageMark == o2.averageMark) && (o1.course.equals(o2.course))?0:-1;
        }
    }
}
