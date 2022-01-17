package AllExercise.ZadaniaClass_allDONE.Zadanie4i5;

public class Point2D {

    private int x;
    private int y;

    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    public Point2D(float x,float  y) {
       this.x = (int) x;
       this.y = (int) y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getXY(){
        int[] getXYArray = new int [2];
        getXYArray[0]=this.x;
        getXYArray[1]=this.y;
        for (int i =0 ; i<getXYArray.length;i++){
            System.out.println("x = " + getXYArray[0] + " y = " + getXYArray[1]);
            break;
        }

        return getXYArray.toString();
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x,int y){
        this.x = x;
        this.y = y;

    }

    @Override
    public String toString() {
        return "x=" + x + ", y=" + y;
    }
}
