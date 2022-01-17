package AllExercise.ZadaniaInterfejsy.ZadanieInterefejsy_Zadanie3;

public class BlueRayPlayer implements Player,HDRPlayer{

    @Override
    public String play(String movie) {
        return "Odtwarzam film " + movie ;
    }

    @Override
    public void stop() {
        System.out.println("Zatrzymanie odtwarzania");
    }

    @Override
    public void canPlayHdr() {
        System.out.println("Może");
    }
}
