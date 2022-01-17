package AllExercise.ZadaniaInterfejsy.ZadanieInterfejsy_Zadanie2_dopisacResztePozniej;

public class Square implements Shape,Shape3d{
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }
}
