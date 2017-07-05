import java.util.Scanner;


/**
 * Created by User on 06.07.2017.
 */
public class lab9_3v02 {
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
        int[] zeroIndex = new int[size];
        int count=0;
        for (int j = 0; j < size; j++) {
            if (arr[j] == 0) {
                zeroIndex[count]=j;
                count++;
            }
        }
        System.out.print("Индексы нулевых элементов: ");
        for (int k=0; k<count; k++){
            System.out.print(zeroIndex[k]+" ");
        }
    }
}