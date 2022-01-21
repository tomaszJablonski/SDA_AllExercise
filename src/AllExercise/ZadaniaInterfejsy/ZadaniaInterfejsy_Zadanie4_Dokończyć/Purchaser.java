package AllExercise.ZadaniaInterfejsy.ZadaniaInterfejsy_Zadanie4_Dokończyć;

public class Purchaser {

    //który zamawiający
    public void howOrder(int order){
        if(order > 0 || order >1000){
            System.out.println("Personal order" + PersonalOrder.class + "Student order"+ StudentOrder.class);
        } else if (order>=100){
            System.out.println("BulkOrder.class = " + BulkOrder.class);
        }
    }


    }

