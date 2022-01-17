package AllExercise.ZadaniaClass_allDONE.Zadanie3;

public class Bicycle extends Vehicle{


    private final int maxSpeed = 25;
    private int numberOfDerailleurs;


    public Bicycle(int actualSpeed, int numberOfDerailleurs) {
        super(25,actualSpeed);
        this.numberOfDerailleurs = numberOfDerailleurs;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "maxSpeed= " + maxSpeed + " actualSpeed " +getActualSpeed() +
                ", numberOfDerailleurs= " + numberOfDerailleurs +
                '}';
    }
}
