import java.io.Serializable;

public class University implements Serializable {
    private Institute institute;
    private Faculty faculty;

    public University(Institute institute, Faculty faculty) {
        this.institute = institute;
        this.faculty = faculty;
    }



    public Institute getInstitute() {
        return institute;
    }

    public void setInstitute(Institute institute) {
        this.institute = institute;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Integer getPassingScoreOfFaculty(){
        return faculty.getPassingScore();
    }

    public String getEntrancePlanOfInstitute(){
        return institute.getEntrancePlan();
    }

    @Override
    public String toString() {
        return "University{" +
                "institute=" + institute.toString() +
                ", faculty=" + faculty.toString() +
                '}';
    }
}
