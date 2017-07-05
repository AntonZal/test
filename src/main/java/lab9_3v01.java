import java.util.Scanner;


/**
 * Created by User on 06.07.2017.
 */
public class lab9_3v01 {
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
        System.out.println("Введите коэффициент кратности");
        int K=0;
        if (sc.hasNextInt()) {
            K = sc.nextInt();
        }


        int summ = 0;
        for (int j = 0; j < size; j++) {
            if (arr[j]%K==0) {
                summ+=arr[j];
            }
        }
        System.out.println("сумма чисел, кратных " + K + " равна " + summ);
    }
}