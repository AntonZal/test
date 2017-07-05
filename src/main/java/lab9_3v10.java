import java.util.Scanner;

/**
 * Created by User on 06.07.2017.
 */
public class lab9_3v10 {
    public static void main(String[] args) {
        int size = 0;
        System.out.println("Введите размер массива");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            size = sc.nextInt();
        }
        int[] arr = new int[size];

        System.out.println("Введите " + size + " натуральных значений в массив");
        for (int i = 0; i < size; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
                arr[i]=Math.abs(arr[i]);
            } else {
                System.out.println("Неверные данные");
                System.exit(3);
            }
        }
        System.out.println("Введите делитель");
        int K=0;
        if (sc.hasNextInt()) {
            K = sc.nextInt();
        }
        int lost=0;
        System.out.println("Элементы, удовлетворяющие странному условию , когда остаток меньше делителя");
        //либо я не понял условие, либо опечатка, но по сути все элементы удовлетворяют условию задачи
        for (int j = 0; j < size; j++) {
            lost=arr[j]%K;
            if (lost <= (K-1)) {
                System.out.print(arr[j]+" ");
            }
        }


    }
}
