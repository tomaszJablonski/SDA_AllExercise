package AllExercise.ZadaniaInterfejsy.ZadanieInterfejsy_Zadanie1;

public class Snake implements Animals{

    @Override
    public String givaAVoice() {
        return "Sssssss";
    }

    @Override
    public String move() {
        return Animals.super.move();
    }
}
