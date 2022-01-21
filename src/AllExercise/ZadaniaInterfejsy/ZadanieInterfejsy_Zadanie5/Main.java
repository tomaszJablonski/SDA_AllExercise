package AllExercise.ZadaniaInterfejsy.ZadanieInterfejsy_Zadanie5;


/*
TODO
 5.
 1. Stwórz interfejs Procesor z jedną metodą, która zwraca boolean - czyIntel(). Zaimplementuj klasy IntelCore oraz AmdRyzen.
 done
 2. Stwórz intefejs PlytaGlowa z jedną metodą, która zwraca boolean - czyObslugujeIntel(). Zaimplementuj klasy PlytaIntel oraz PlytaAmd.
 done
 3. Stwórz klasę Komputer z trzema polami: wlaczony (boolean), plytaGlowna oraz procesor. Proces i plytaGlowa powinna byc przekazywana w konstruktorze.
 done
 4. Dodaj prywatną metodę czyCzesciPasuja(), która sprawdza, czy podana płyta głowna oraz procesor są kompatybilne.
 chyba Done
 5. Zaimplementuj metodę wlacz(), która sprawdza czy części do siebie pasują i jeśli pasują to ustawia pole wlaczony na true.
 chyba Done

 */
public class Main{
    public static void main (String[] args) {



    }

    public static void ifIntelWorks(Processor processor,MainBoard mainBoard){
        String result = String.valueOf(processor);
        String result1 = String.valueOf(mainBoard);
        System.out.println("processor" + result + "mainBoard" + result1);
    }

}
