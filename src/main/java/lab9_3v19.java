/**
 * Created by User on 08.07.2017.
 */
public class lab9_3v19 {
    public static void main(String[] args){
        int size=(int)(Math.random()*15);
        double[] arrArg=new double[size];
        for (int i = 0; i<size; i++){
            arrArg[i]=(Math.random()-0.55)*20;
            if (arrArg[i]==0){
                arrArg[i]=1;
            }
        }
        for (double ar: arrArg){
            System.out.print(ar+", ");
        }
        System.out.println();
        double multSubZero=1;
        double multAboveZero=1;
        for (double arg: arrArg){
            if (arg < 0){
                multSubZero*=arg;
            }
            else{
                multAboveZero*=arg;
            }
        }
        if (Math.abs(multSubZero) > Math.abs(multAboveZero)){
            System.out.println("Произведение отрицательных элементов по модулю больше");
        }
        else {
            System.out.println("Произведение положительных элементов по модулю больше");
        }

    }
}
