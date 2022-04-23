import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class StudControllerTest {

    @Test
    @DisplayName("Checking the sorting functionality")
    void checkSortedUsers() {
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

        Student stud1 = new Student(1,  "Vitalii", "Drapak","IT-13",  subjects, stud1Marks);
        Student stud2 = new Student(2, "Artem", "Derid","IT-13", subjects, stud2Marks);
        Student stud3 = new Student(3, "Anna", "Didukh","IT-13", subjects, stud3Marks);

        ArrayList<Student> students = new ArrayList<Student>(Arrays.asList(stud1, stud2, stud3));

        ArrayList<Student> sortedStudents = (ArrayList<Student>) StudController.sortStudentByValues(students);

        assertEquals( "Vitalii", students.get(0).getFirstName());
        assertNotEquals( "Vitalii", sortedStudents.get(0).getFirstName());
    }


    @Test
    @DisplayName("Checking the indexed user functionality")
    void checkIndexedUsers() {
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

        Student stud1 = new Student(1,  "Vitalii", "Drapak","IT-13",  subjects, stud1Marks);
        Student stud2 = new Student(2, "Artem", "Derid","IT-13", subjects, stud2Marks);
        Student stud3 = new Student(3, "Anna", "Didukh","IT-13", subjects, stud3Marks);

        ArrayList<Student> students = new ArrayList<Student>(Arrays.asList(stud1, stud2, stud3));

        Map<Integer, Student> indexedStudents =  StudController.getSortedIndexedStudents(students);

        assertEquals( "Vitalii", students.get(0).getFirstName());
        assertNotEquals( "Vitalii", indexedStudents.get(0).getFirstName());
    }

    @Test
    @DisplayName("Checking the binary search for users")
    void checkBinarySearchOfUsers() {
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

        Student stud1 = new Student(1,  "Vitalii", "Drapak","IT-13",  subjects, stud1Marks);
        Student stud2 = new Student(2, "Artem", "Erosh","IT-23", subjects, stud2Marks);
        Student stud3 = new Student(3, "Anna", "Fromm","IT-33", subjects, stud3Marks);

        ArrayList<Student> students = new ArrayList<Student>(Arrays.asList(stud1, stud2, stud3));

        assertEquals( true, StudController.isStudentsOnTheSameCourse(students, stud1, "Drapak"));
    }
}
