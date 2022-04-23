import java.io.Serializable;

public class Specialization implements Serializable {
    private String name;

    public Specialization() {
    }

    public Specialization(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Specialization{" +
                "name='" + name + '\'' +
                '}';
    }
}
