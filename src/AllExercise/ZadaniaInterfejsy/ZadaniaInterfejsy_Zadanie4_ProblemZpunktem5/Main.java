package AllExercise.ZadaniaInterfejsy.ZadaniaInterfejsy_Zadanie4_ProblemZpunktem5;

/*
TODO
 4.
 1. Stwórz interfejs Order, który będzie opisywał zamówienie.
 Każde zamówienie posiada ilość elementów, łączną kwotę zamówienia oraz zamawiającego.
 done
 2. Zamawiający jest opisywany przez osobną klasę
 done
 3. Stwórz klasę Store, która reprezentuje sklep. Klasa Store przyjmuje cenę elementów,
 wartość zniżki dla studentów oraz wartość zniżki dla zamówień hurtowych.
 ( done)
 4. Stwórz klasy PersonalOrder, StudentOrder, BulkOrder. Każda z tych klas reprezentuje inny typ zamówienia.
 done

 5. W klasie Store dodaj metodę, która przyjmuje ilość elementów oraz zamawiającego
 i na tej podstawie zwraca odpowiednie zamówienie. Przyjmij, że informacja
 czy zamawiający jest studentem znajduję się w klasie opisującej
 zamawiającego, a zamówienia hurtowe to zamówienia które mają więcej niż 1000 przedmiotów.
 undone

 */

public class Main {
    public static void main(String[] args) {

        Store store = new Store(1500,0.25,0);
        StudentOrder studentOrder = new StudentOrder();



    }

    public static void numberOfElements (Order numbers){
        String result = String.valueOf(numbers.numberOfElements());
        System.out.println(result);
    }

    public static void orderAmount(Order amount){
        String result = String.valueOf(amount.orderAmount());
        System.out.println(result);
    }

    public static void purchaser(Order purchaser){
        String result = purchaser.purchaser();
        System.out.println(result);
    }
}
