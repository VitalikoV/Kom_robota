import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionalityTest {
    @Test
    @DisplayName("Checking the percentage functionality")
    void checkPercentage() {
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
        Double percentage = course.calculatePercentageOfStudentsWithDefMarks();
        assertEquals( 66.0, percentage);
    }

    @Test
    @DisplayName("Checking the calculating functionality")
    void checkQuantityOfMarks() {
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

        for(Subject subj : subjInfo.keySet()){
            if(Objects.equals(subj.getName(), "Programming")){
                assertEquals(2, subjInfo.get(subj));
            }

            if(Objects.equals(subj.getName(), "Math")){
                assertEquals(1, subjInfo.get(subj));
            }
        }
    }
}
