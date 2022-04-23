import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

public class Faculty implements Serializable {
    private List<Specialization> specializations;
    private Integer passingScore;

    public Faculty() {
    }

    public Faculty(List<Specialization> specializations, Integer passingScore) {
        this.specializations = specializations;
        this.passingScore = passingScore;
    }

    public List<Specialization> getSpecializations() {
        return specializations;
    }

    public void setSpecializations(List<Specialization> specializations) {
        this.specializations = specializations;
    }

    public Integer getPassingScore() {
        return passingScore;
    }

    public void setPassingScore(Integer passingScore) {
        this.passingScore = passingScore;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "specializations=" + specializations.stream().map(m -> m.toString()).collect(Collectors.toList()) +
                ", passingScore=" + passingScore +
                '}';
    }
}
