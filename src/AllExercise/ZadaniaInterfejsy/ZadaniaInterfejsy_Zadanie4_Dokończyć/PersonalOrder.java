package AllExercise.ZadaniaInterfejsy.ZadaniaInterfejsy_Zadanie4_Dokończyć;

public class PersonalOrder implements Order{


    @Override
    public int numberOfElements() {
        return 1;
    }

    @Override
    public double orderAmount() {
        return 200;
    }

    @Override
    public String purchaser() {
        return "Personal Order";
    }
}
