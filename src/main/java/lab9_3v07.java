import java.util.Scanner;

/**
 * Created by User on 06.07.2017.
 */
public class lab9_3v07 {
    public static void main(String[] args) {
        int size = 0;
        System.out.println("Введите размер массива");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            size = sc.nextInt();
        }
        double[] arr = new double[size];

        System.out.println("Введите " + size + " значений в массив");
        for (int i = 0; i < size; i++) {
            if (sc.hasNextDouble()) {
                arr[i] = sc.nextDouble();
            } else {
                System.out.println("Неверные данные");
                System.exit(3);
            }
        }


        int countSubZero = 0;
        int countAboveZero = 0;
        int countZero = 0;
        for (int j = 0; j < size; j++) {
            if (arr[j] == 0) {
                countZero++;
            }
            else if(arr[j] < 0){
                countSubZero++;
            }
            else if (arr[j] > 0){
                countAboveZero++;
            }
        }
        System.out.println("Нулевых элементов" + countZero);
        System.out.println("Отрицательных элементов" + countSubZero);
        System.out.println("Положительных элементов" + countAboveZero);

    }
}
