import java.util.Scanner;

/**
 * Created by User on 06.07.2017.
 */
public class lab9_3v05 {
    public static void main(String[] args) {
        int size = 0;
        System.out.println("Введите размер массива");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            size = sc.nextInt();
        }
        int[] arr = new int[size];

        System.out.println("Введите " + size + " целочисленных значений в массив");
        for (int i = 0; i < size; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            } else {
                System.out.println("Неверные данные");
                System.exit(3);
            }
        }
        int[] evenArr = new int[size];
        int max = arr[0];
        int min = arr[0];
        for (int j = 1; j < size; j++) {
            if (arr[j] < min) {
                min = arr[j];
            } else if (arr[j] > max) {
                max = arr[j];
            }
        }

        System.out.print("Длина числовой оси массива "+(max-min));


    }
}
