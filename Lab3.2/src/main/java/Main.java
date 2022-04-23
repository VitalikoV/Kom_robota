import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> students = StudController.createStudents();
        ExecutionFacade.processInput(students);
    }
}