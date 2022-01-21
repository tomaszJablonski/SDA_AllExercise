package AllExercise.ZadaniaInterfejsy.ZadaniaInterfejsy_Zadanie4_Dokończyć;

public class StudentOrder implements Order{

    @Override
    public int numberOfElements() {
        return 3;
    }

    @Override
    public double orderAmount() {
        return 1500;
    }

    @Override
    public String purchaser() {
        return "Student Order";
    }
}
