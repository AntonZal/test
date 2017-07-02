
/**
 * Created by User on 05.06.2017.
 */

import java.util.Scanner;

public class task7 {
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
        int[] ar = new int[m];
        int count = 0;
        for (int i = 0; i < m; i++) {
            if (sc.hasNextInt()) {
                ar[i] = sc.nextInt();
            }
        }

        for (int j = 0; j < m; j++) {
            System.out.print(ar[j] + " ");
            if (ar[j] > 0) {
                ar[j] *= ar[j];
            }
            if (ar[j] < 0) {
                ar[j] = Math.abs(ar[j]);
            }
        }

        System.out.println();
        for (int l = 0; l < m; l++) {
            System.out.print(ar[l] + " ");
        }


    }
}
