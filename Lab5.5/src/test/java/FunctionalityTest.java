import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionalityTest {
    @Test
    @Description("Test of sorting functionality")
    public void sortingFunctionalityTest(){
        ArrayList<University> universities = UniversityController.createUniversities();
        UniversityController.sortUniversitiesByPassingScoreAndPlan(universities);
        assertEquals(3, universities.get(0).getPassingScoreOfFaculty());
    }

    @Test
    @Description("Test of searching functionality")
    public void searchingFunctionalityTest(){
        ArrayList<University> universities = UniversityController.createUniversities();
        Institute institute = UniversityController.getInstituteByPassingScore(universities,4);
        assertEquals("Technological institute", institute.getName());
    }
}
