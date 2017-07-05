import com.sun.javafx.runtime.SystemProperties;

/**
 * Created by User on 08.07.2017.
 */
public class lab9_3v13 {
    public static void main(String[] args){
        int[] arr={12, 1, 90, -34, 8, 0, 34, 5, 32, -9};
        for (int ar: arr){
            if (!(ar == 0)) {
                System.out.print(ar+", ");
            }
            else {
                System.exit(0);
            }
        }
    }
}
