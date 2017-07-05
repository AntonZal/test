import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 08.07.2017.
 */
public class lab9_3v20 {
    public static void main(String[] args){
        int size=(int)(Math.random()*30);
        int[] arrArgs=new int[size];
        for (int arr=0; arr<size; arr++){
            arrArgs[arr]=(int)(Math.random()*100);
            System.out.print(arrArgs[arr]+", ");
        }
        System.out.println();

        List<Integer> oddArr = new ArrayList<Integer>();
        List<Integer> evenArr = new ArrayList<Integer>();
        for (int arg: arrArgs){
            if (arg % 2 == 0){
                evenArr.add(arg);
            }
            else{
                oddArr.add(arg);
            }
        }

        System.out.println(evenArr);
        System.out.println(oddArr);
    }
}
