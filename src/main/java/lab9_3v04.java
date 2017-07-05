import java.util.Scanner;

/**
 * Created by User on 06.07.2017.
 */
public class lab9_3v04 {
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
        int count=0;
        for (int j = 0; j < size; j++) {
            if (arr[j] % 2 == 0) {
                evenArr[count]=arr[j];
                count++;
            }
        }
        if (count ==0){
            System.out.print("Четные элементы отсутствуют");
        }
        else {
            System.out.print("Четные элемены");
            for (int k = 0; k < count; k++) {
                System.out.print(evenArr[k] + " ");
            }
        }
    }
}
