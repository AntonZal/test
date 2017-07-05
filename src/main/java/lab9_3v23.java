import java.util.Scanner;

/**
 * Created by User on 08.07.2017.
 */
public class lab9_3v23 {
    public static void main(String[] args) {
        int size = (int) ((Math.random() * 50));
        System.out.println("Размер массива " + size);
        int[] arrRand = new int[size];
        for (int s = 0; s < size; s++) {
            arrRand[s] = (int) (Math.random() * 1000);
            System.out.print(arrRand[s] + ", ");
        }
        System.out.println();
        System.out.println("Введите точку минимума");
        int min = 0;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            min = sc.nextInt();
        }


        int count = 0;
        for (int arr : arrRand) {
            if (arr > min) {
                count++;
            }
        }

        System.out.print("количество значений массива выше минимума равно " + count);
    }
}


