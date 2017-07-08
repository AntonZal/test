/**
 * Created by User on 05.06.2017.
 */

import java.util.Scanner;

public class task5 {
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
        /* m=Math.abs(m);*/
        System.out.println("Введите целочисленные значения элементов массива");
        int[] ar = new int[m];

        for (int i = 0; i < m; i++) {
            if (sc.hasNextInt()) {
                ar[i] = sc.nextInt();
            }
        }
        int elemMin = ar[0];
        int elemMax = ar[0];
        int jMin = 0;
        int jMax = 0;
        for (int j = 0; j < m; j++) {
            if (ar[j] < elemMin) {
                elemMin = ar[j];
                jMin = j;
            }
<<<<<<< HEAD
            else if (ar[j] > elemMax) {
=======
<<<<<<< HEAD
            if (ar[j] > elemMax) {
=======
            else if (ar[j] > elemMax) {
>>>>>>> bdc141c9098e8347bee30d211cee5dc85e20735f
>>>>>>> 691785416e61a0e54478b17a9a0afd54b7f2b7d9
                elemMax = ar[j];
                jMax = j;
            }

        }
        for (int l = 0; l < m; l++) {
            System.out.print(ar[l] + " ");
        }
        System.out.println();
        ar[jMin] = elemMax;
        ar[jMax] = elemMin;

        for (int k = 0; k < m; k++) {
            System.out.print(ar[k] + " ");
        }
    }
}
