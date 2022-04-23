import java.io.Serializable;

public class Institute implements Serializable {
    private String name;
    private String entrancePlan;

    public Institute(String name, String entrancePlan) {
        this.name = name;
        this.entrancePlan = entrancePlan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEntrancePlan() {
        return entrancePlan;
    }

    public void setEntrancePlan(String entrancePlan) {
        this.entrancePlan = entrancePlan;
    }

    @Override
    public String toString() {
        return "Institute{" +
                "name='" + name + '\'' +
                ", entrancePlan='" + entrancePlan + '\'' +
                '}';
    }
}
