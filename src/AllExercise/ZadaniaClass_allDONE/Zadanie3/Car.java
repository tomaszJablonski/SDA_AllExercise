package AllExercise.ZadaniaClass_allDONE.Zadanie3;

public class Car extends Vehicle{

    private final int maxSpeed = 100;
    private String fuelType;


    public Car(int actualSpeed, String fuelType) {
        super(100,actualSpeed);
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Car{" +
                " maxSpeedCar= " + maxSpeed +" actualSpeed "+ getActualSpeed()+
                ", fuelType= " + fuelType + '\'' +
                '}';
    }




}
