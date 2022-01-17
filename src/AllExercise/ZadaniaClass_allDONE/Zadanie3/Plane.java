package AllExercise.ZadaniaClass_allDONE.Zadanie3;

public class Plane extends Vehicle{

    private final int maxSpeed = 800;
    private int numberOfEngines;


    public Plane(int actualSpeed, int numberOfEngines) {
        super(800,actualSpeed);
        this.numberOfEngines = numberOfEngines;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "maxSpeed=" + maxSpeed +" actualSpeed " + getActualSpeed() +
                ", numberOfEngines=" + numberOfEngines +
                '}';
    }
}
