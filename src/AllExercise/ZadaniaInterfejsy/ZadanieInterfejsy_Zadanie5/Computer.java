package AllExercise.ZadaniaInterfejsy.ZadanieInterfejsy_Zadanie5;

public class Computer {

    private Processor processor;
    private MainBoard mainBoard;

    public Computer(Processor processor, MainBoard mainBoard) {
        this.processor = processor;
        this.mainBoard = mainBoard;
    }

     private boolean ifPartsWorks(){
        if(processor.ifIntel() == mainBoard.ifIntelworks()){
            return true;
        }

        return false;
    }
        public boolean trunOn () {
            if (ifPartsWorks() == true) {
                return true;
            }
            return false;
        }


    }

