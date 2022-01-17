package AllExercise.ZadaniaInterfejsy.ZadanieInterfejsy_Zadanie1;

public interface Animals  extends MoveAnimal{

    String givaAVoice();


    @Override
    default String move() {
        return "This animal is moooove ";
    }
}
