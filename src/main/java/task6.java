
/**
 * Created by User on 05.06.2017.
 */

import java.util.Scanner;

public class task6 {
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
<<<<<<< HEAD
=======

>>>>>>> bdc141c9098e8347bee30d211cee5dc85e20735f
        System.out.println("Введите целочисленные значения элементов массива");
        int[] ar = new int[m];
        int count = 0;
        for (int i = 0; i < m; i++) {
            if (sc.hasNextInt()) {
                ar[i] = sc.nextInt();
            }
            if (ar[i] < 0) {
                count++;
            }
        }
<<<<<<< HEAD
=======

>>>>>>> bdc141c9098e8347bee30d211cee5dc85e20735f
        for (int l = 0; l < m; l++) {
            System.out.print(ar[l] + " ");
        }
        System.out.println();
<<<<<<< HEAD

=======
>>>>>>> bdc141c9098e8347bee30d211cee5dc85e20735f
        System.out.println("количество отрицательных элементов:" + count);

    }
}
