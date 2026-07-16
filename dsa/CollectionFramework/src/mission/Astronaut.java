package mission;

public class Astronaut {
    String astronautId;
    String name;
    String specialization;

    public Astronaut(String astronautId, String name, String specialization) {
        this.astronautId = astronautId;
        this.name = name;
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return name + " (" + specialization + ")";
    }
}
