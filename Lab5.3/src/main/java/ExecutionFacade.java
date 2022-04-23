import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;

public class ExecutionFacade {

    public static void processInput(ArrayList<Student> students) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("What action do you want to do?");
        System.out.println("1. Show all students");
        System.out.println("2. Sort students and then show them");
        System.out.println("3. Index users");
        System.out.println("4. Find the user");
        System.out.print("Enter number => ");
        Integer action = Integer.parseInt(reader.readLine().trim());
        if(action == 1) {
            StudController.showAllStudentsInfo(students);
        }else if(action == 2){
            System.out.println();
            System.out.println("Sorted students: ");

            ArrayList<Student> sortedStudents = (ArrayList<Student>) StudController.sortStudentByValues(students);
            StudController.showAllStudentsInfo(sortedStudents);
        }else if(action == 3) {
            System.out.println();
            System.out.println("Indexed users: ");
            Map<Integer, Student> indexedStudents = StudController.getSortedIndexedStudents(students);
            for (Integer index : indexedStudents.keySet()) {
                System.out.println("index: " + index + ", value: " + indexedStudents.get(index).toString());
            }
        }else if(action == 4) {
            ArrayList<Student> sortedStudents = (ArrayList<Student>) StudController.sortStudentByValues(students);
            StudController.showAllStudentsInfo(sortedStudents);

            System.out.println();
            Boolean isUserInTheList = StudController.isStudentsOnTheSameCourse(sortedStudents, students.get(0), "Drapak");
            System.out.println("isUserInTheList: " + isUserInTheList);
        }else{
            System.out.println("Your action cannot be executed, because it was not found");
        }
    }
}
