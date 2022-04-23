import jdk.jfr.Description;
import org.example.Student;
import org.example.StudentController;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionalityTest {
    @Test
    @Description("Check adding functionality")
    public void testAddingStudent() throws Exception {
        ArrayList<Student> students = new ArrayList<>();
        StudentController.addStudent(students, "Testing", 2,4,5);
        assertEquals(1, students.size());
    }

    @Test
    @Description("Check editing functionality")
    public void testEditingStudent() throws Exception {
        ArrayList<Student> students = new ArrayList<>();
        StudentController.addStudent(students, "Testing", 2,4,5);
        assertEquals(2, students.get(0).getEkzamMark1());
        StudentController.editStudentInfo(students,"Testing", 3, 4, 5);
        assertEquals(3, students.get(0).getEkzamMark1());
    }

    @Test
    @Description("Check sorting functionality by average mark")
    public void testSortingStudent() throws Exception {
        ArrayList<Student> students = new ArrayList<>();
        StudentController.addStudent(students, "Testing", 3,4,5);
        StudentController.addStudent(students, "Some test", 5,5,3);
        StudentController.addStudent(students, "Testing the logic", 4,3,3);

        ArrayList<Student> sortedStudents = StudentController.sortStudentsByAverageMark(students);
        assertEquals(5, sortedStudents.get(0).getEkzamMark1());
    }
}
