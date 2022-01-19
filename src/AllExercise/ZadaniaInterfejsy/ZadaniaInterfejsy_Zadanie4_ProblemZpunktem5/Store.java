package AllExercise.ZadaniaInterfejsy.ZadaniaInterfejsy_Zadanie4_ProblemZpunktem5;

public class Store implements Order {

    double priceOfElements;
    double discountForStudents;
    double discountForBulkOrder;

    public Store(double priceOfElements, double discountForStudents, double discountForBulkOrder) {
        this.priceOfElements = priceOfElements;
        this.discountForStudents = discountForStudents;
        this.discountForBulkOrder = discountForBulkOrder;
    }

    public double getPriceOfElements() {
        return priceOfElements;
    }

    public void setPriceOfElements(double priceOfElements) {
        this.priceOfElements = priceOfElements;
    }

    @Override
    public String toString() {
        return "Store{" +
                "priceOfElements=" + priceOfElements +
                '}';
    }

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
        return null;
    }


//To nie działa!
//    public String customer(int numbers, String purchaserAll){
//        numbers = numberOfElements();
//        purchaserAll = purchaser();
//        return customer(numbers,purchaserAll);

//    niedokończone bo nie wiem jak
//    public String costumer(int numberOfElements,int purchaser){
//
//  }


    }





