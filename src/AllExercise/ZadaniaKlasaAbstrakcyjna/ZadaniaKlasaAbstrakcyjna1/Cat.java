package AllExercise.ZadaniaKlasaAbstrakcyjna.ZadaniaKlasaAbstrakcyjna1;

public  class Cat extends Animal  {

    protected Cat(int age) {
        super(age);
    }

    @Override
    public  void giveAVoice(){
        System.out.println("Miał miał");
    }
}
