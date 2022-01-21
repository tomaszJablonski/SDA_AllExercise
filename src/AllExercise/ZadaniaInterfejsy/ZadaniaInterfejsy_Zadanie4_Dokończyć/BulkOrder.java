package AllExercise.ZadaniaInterfejsy.ZadaniaInterfejsy_Zadanie4_Dokończyć;

public class BulkOrder implements Order{


    @Override
    public int numberOfElements() {
        if (numberOfElements()<=1000){
            System.out.println("This is not a bulk order");
        } else {
            System.out.println("This is bulk order");
        }
        return numberOfElements();
    }

    @Override
    public double orderAmount() {
        return 25000;
    }

    @Override
    public String purchaser() {
        return "Bulk Order";
    }
}
