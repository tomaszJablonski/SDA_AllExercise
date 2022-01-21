package AllExercise.ZadaniaInterfejsy.ZadaniaInterfejsy_Zadanie4_Dokończyć;

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
 done
 i na tej podstawie zwraca odpowiednie zamówienie. Przyjmij, że informacja
 czy zamawiający jest studentem znajduję się w klasie opisującej
 zamawiającego, a zamówienia hurtowe to zamówienia które mają więcej niż 1000 przedmiotów.
 undone

 */

public class Main {
    public static void main(String[] args) {

        PersonalOrder personalOrder = new PersonalOrder();
        System.out.println("personalOrder.numberOfElements() = " + personalOrder.numberOfElements());
        System.out.println("personalOrder.orderAmount() = " + personalOrder.orderAmount());
        System.out.println("personalOrder.purchaser() = " + personalOrder.purchaser());

        Store store = new Store(500,25,10);
        System.out.println("store.howOrder(500) = " + store.howOrder(500));


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
