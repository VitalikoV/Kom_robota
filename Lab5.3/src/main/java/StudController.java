import java.util.*;
import java.util.stream.Collectors;

public class StudController {

    public static List<Student> sortStudentByValues(List<Student> students){
        Comparator<Student> compareByName = Comparator
                .comparing(Student::getAverageMark)
                .thenComparing(Student::getCourse)
                .thenComparing(Student::getLastName);

        return students.stream()
                .sorted(compareByName)
                .collect(Collectors.toList());
    }

    public static Map<Integer, Student> getSortedIndexedStudents(List<Student> students){
        Comparator<Student> compareByName = Comparator
                .comparing(Student::getAverageMark)
                .thenComparing(Student::getCourse)
                .thenComparing(Student::getLastName);

        List<Student> sortedStudents = students.stream()
                .sorted(compareByName)
                .collect(Collectors.toList());

        Map<Integer, Student> indexedUsers = new HashMap<>();
        for(int i = 0; i < sortedStudents.size(); i++){
            indexedUsers.put(i, sortedStudents.get(i));
        }

        return indexedUsers;
    }


    public static Boolean isStudentsOnTheSameCourse(List<Student> students, Student studentToCheck, String lastname){
        int l = 0, r = students.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            Student currentStudent = students.get(m);
            int res = lastname.compareTo(currentStudent.getLastName());

            // Check if x is present at mid
            if (res == 0
                    && Objects.equals(currentStudent.getCourse(), studentToCheck.getCourse())
                    && currentStudent.getAverageMark() == studentToCheck.getAverageMark())
                return true;

            // If x greater, ignore left half
            if (res > 0)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        return false;

    }

    public static ArrayList<Student> createStudents(){
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

        return new ArrayList<Student>(Arrays.asList(stud1, stud2, stud3));
    }

    public static void showAllStudentsInfo(List<Student> students) {
        System.out.format("%-3s %-15s %-15s %-10s", "№", "FirstName", "LastName", "Course");
        for(Subject subj : students.get(0).getSubjectList()){
            System.out.format("%-20s", subj.getName());
        }
        System.out.println();
        for (Student student : students) {
            System.out.println();
            System.out.format("%-3s %-15s %-15s %-10s", student.getNumber(), student.getFirstName(), student.getLastName(), student.getCourse());
            for (Subject subject : student.getSubjectList()) {
                System.out.format("%-20s", student.getSubjectToMark().get(subject).getDefinedMark());
            }
            System.out.println();
        }
    }


}
