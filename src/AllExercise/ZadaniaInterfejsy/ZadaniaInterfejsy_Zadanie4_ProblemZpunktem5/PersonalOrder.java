package AllExercise.ZadaniaInterfejsy.ZadaniaInterfejsy_Zadanie4_ProblemZpunktem5;

public class PersonalOrder implements Order{


    @Override
    public int numberOfElements() {
        return 0;
    }

    @Override
    public double orderAmount() {
        return 0;
    }

    @Override
    public String purchaser() {
        return "Personal Order";
    }
}
