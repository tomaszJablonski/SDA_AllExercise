package AllExercise.ZadaniaClass_allDONE.Zadanie4i5;

public class Point3D extends Point2D {

    private int z;

    public Point3D(float x, float y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public String getXYZ(){
        int[] getXYZArray = new int [3];
        getXYZArray[0]=getX();
        getXYZArray[1]=getY();
        getXYZArray[2]=this.z;
        for (int i =0 ; i<getXYZArray.length;i++){
            System.out.println("x = " + getXYZArray[0] + " y = " + getXYZArray[1] + " z = " + getXYZArray[2]);
            break;
        }

        return getXYZArray.toString();
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void setXYZ(int x, int y, int z){
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }

    @Override
    public String toString() {
        return  "x = " + getX() + " y = " + getY() +
                " z = " + z ;
    }
}
