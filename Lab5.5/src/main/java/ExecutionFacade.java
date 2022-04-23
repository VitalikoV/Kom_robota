import javax.xml.crypto.Data;
import java.util.*;

public class ExecutionFacade {

    public static void processData(){
        ArrayList<University> universities = UniversityController.createUniversities();
        DataParser.generateByteData(universities);
//        DataParser.printStudentsData();
        ArrayList<University> universitiesFromBinaryFile = DataParser.readStudentsData();

        System.out.println("list of not sorted universities: ");
        for (University university : universitiesFromBinaryFile){
            System.out.println(university.toString());
        }

        System.out.println();
        System.out.println("List of sorted universities: ");
        ArrayList<University> sortedUniversity = UniversityController.sortUniversitiesByPassingScoreAndPlan(universitiesFromBinaryFile);
        for (University university : sortedUniversity){
            System.out.println(university.toString());
        }

        Institute institute = UniversityController.getInstituteByPassingScore(sortedUniversity, 4);
        System.out.println("institute: " + institute.toString());
    }

}
