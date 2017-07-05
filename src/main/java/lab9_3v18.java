
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 08.07.2017.
 */
public class lab9_3v18 {
    public static void main(String[] args) {
        int size = (int) (Math.random() * 50);
        int[] binaryArr = new int[size];
        for (int bi = 0; bi < size; bi++) {
            binaryArr[bi]=(int)(Math.random()*2);
        }
        System.out.print("[");
        for (int bin: binaryArr){
            System.out.print(bin+", ");
        }
        System.out.println("]");

        List<Integer> newBinArr=new ArrayList<Integer>(size);

        for (int i=0; i<size; i++){
            if (binaryArr[i]==0){
                newBinArr.add(0,binaryArr[i]);
            }
            else {
                newBinArr.add(binaryArr[i]);
            }
        }
        System.out.println(newBinArr);

    }
}
