package AllExercise.ZadaniaInterfejsy.ZadaniaInterfejsy_Zadanie4_Dokończyć;

public class Store extends Purchaser {

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

    //dokończyć !!
//    public int howPurchaser(Order numberOfElements,Purchaser purchaser ){
//
//        return howOrder();
//        }
    }
















