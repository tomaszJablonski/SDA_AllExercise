package AllExercise.ZadaniaInterfejsy.ZadanieInterefejsy_Zadanie3;

public class DVDPlayer implements Player{

    @Override
    public String play(String movie) {
        return "Odtwarzam film " + movie;
    }

    @Override
    public void stop() {
        System.out.println("Odtwarzacz DVD zatrzymany");

    }
}
