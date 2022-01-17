package AllExercise.ZadaniaInterfejsy.ZadanieInterfejsy_Zadanie2_dopisacResztePozniej;

public class Circle implements Shape{
    private double  r = 10;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return 3.14*Math.sqrt(r);
    }
}
