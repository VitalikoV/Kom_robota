import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class UniversityController {

    public static ArrayList<University> createUniversities(){
        Specialization financeSpecialization = new Specialization("Psychology");
        Specialization managementSpecialization = new Specialization("Socialization");
        Faculty psychologyFaculty = new Faculty(List.of(financeSpecialization, managementSpecialization), 3);

        Specialization technologySpecialization = new Specialization("Technology");
        Faculty techFaculty = new Faculty(List.of(technologySpecialization), 4);
        Institute  psychologyInstitute = new Institute("Institute of discoveries about how people think", "Just give the documents");
        Institute techInstitute = new Institute("Technological institute", "4 tests and interview");

        ArrayList<University> universities = new ArrayList<>();

        universities.add(new University(techInstitute, techFaculty));
        universities.add(new University(psychologyInstitute, psychologyFaculty));
        return universities;
    }

    public static ArrayList<University> sortUniversitiesByPassingScoreAndPlan(ArrayList<University> universities){
        universities.sort(Comparator.
                comparing(University::getPassingScoreOfFaculty)
                .thenComparing(University::getEntrancePlanOfInstitute));

        return universities;
    }

    public static Institute getInstituteByPassingScore(ArrayList<University> universities, Integer passingScore){
        for(University university : universities){
            if(Objects.equals(university.getPassingScoreOfFaculty(), passingScore)){
                return university.getInstitute();
            }
        }
        return null;
    }
}
