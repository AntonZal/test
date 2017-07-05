import java.util.Scanner;

/**
 * Created by User on 08.07.2017.
 */
public class lab9_3v21 {
    public static void main(String[] args) {
        int size = (int) ((Math.random() * 50));
        System.out.println("Размер массива " + size);
        int[] arrRand = new int[size];
        for (int s = 0; s < size; s++) {
            arrRand[s] = (int) (Math.random() * 1000);
            System.out.print(arrRand[s] + ", ");
        }
        System.out.println();
        System.out.println("Введите начало отрезка.");
        int beg = 0;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            beg = sc.nextInt();
        }
        int end = 1000;
        System.out.println("Введите конец отрезка.");
        if (sc.hasNextInt()) {
            end = sc.nextInt();
        }

        int max = beg;
        int begBool = 0;
        for (int arr : arrRand) {
            if (arr == beg) {
                begBool++;
            }
            if ((arr < end) & (arr > beg)) {
                if (max < arr) {
                    max = arr;
                }

            }
        }
        if ((beg == max) & (begBool == 0)) {
            System.out.println("на заданном отрезке отсутствуют значения массива");
        } else {
            System.out.print("Максимальное значение на заданном отрезке " + max);
        }
    }
}
