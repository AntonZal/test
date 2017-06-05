import java.util.Scanner;

/**
 * Created by User on 05.07.2017.
 */
public class task15 {
    public static void main(String[] args) {
        System.out.println("Введите размерность массива");
        Scanner sc = new Scanner(System.in);
        int m = 0;
        if (sc.hasNextInt()) {
            m = sc.nextInt();
            m = Math.abs(m);
        } else {
            System.out.println("Введены некорректные данные");
            System.exit(1);
        }

        System.out.println("Введите целочисленные значения элементов массива");
        int[] argAr = new int[m];

        for (int i = 0; i < m; i++) {
            if (sc.hasNextInt()) {
                argAr[i] = sc.nextInt();
            }
        }

        //founding first even
        int minEven=argAr[0];
        if (minEven % 2 == 1) {
            for (int ar : argAr) {
                if (ar % 2 == 0) {
                    minEven = ar;
                    break;
                }
            }
        }
        //if even is absent
        if (minEven % 2 == 1){
            System.out.println(minEven);
            System.exit(1);
            }
        //founding min even
         for (int arg : argAr){
            if (arg % 2 == 0){
                if (arg < minEven){
                    minEven=arg;
                }
            }
         }

        System.out.println(minEven);
    }
}
