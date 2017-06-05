
/**
 * Created by User on 05.06.2017.
 */

import java.util.Scanner;

public class task8 {
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
        int countSubZero = 0;
        int countAboveZero = 0;
        for (int i = 0; i < m; i++) {
            if (sc.hasNextInt()) {
                ar[i] = sc.nextInt();
            }
            if (ar[i] > 0) {
                countAboveZero++;
            }
            if (ar[i] < 0) {
                countSubZero++;
            }

        }
        System.out.println();
        for (int l = 0; l < m; l++) {
            System.out.print(ar[l] + " ");
            System.out.println();
        }
        if (countAboveZero > countSubZero) {
            System.out.println("Положительных чисел больше на  " + (countAboveZero - countSubZero));
        }

        if (countAboveZero < countSubZero) {
            System.out.println("Отрицательных чисел больше на  " + (countSubZero - countAboveZero));
        }
        if (countAboveZero == countSubZero) {
            System.out.println("Одинаковое количество положительных и отрицательных чисел");
        }
    }
}
