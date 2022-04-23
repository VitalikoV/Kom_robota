import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
//        ArrayList<Student> students = StudController.createStudents();
//        StudentParser.generateCSVFile(students, "students");

        ArrayList<Student> students = StudentParser.createUsersFromCSVFile("students.csv");
        ExecutionFacade.processInput(students);
    }
}
