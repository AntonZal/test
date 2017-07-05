import java.util.Scanner;

/**
 * Created by User on 08.07.2017.
 */
public class lab9_3v17 {
    public static void main(String[] args) {
        int size = (int) ((Math.random() * 50));
        System.out.println("Размер массива " + size);
        int[] arrRand = new int[size];
        for (int s = 0; s < size; s++) {
            arrRand[s] = ((int) (Math.random() * 10)) + 1;
        }
        System.out.println("Массив задан рандомно (1-10).");
        System.out.println("Введите точку минимума");
        int min = 0;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            min = sc.nextInt();
        }


        int mult = 1;
        for (int arr : arrRand) {
            if (arr > min) {
                mult *= arr;
            }
        }
        if (!(mult == 1)) {
            System.out.print("Произведение элементов выше точки минимума = " + mult);
        } else {
            System.out.print("Элементов выше этой точки нет");
        }

    }
}

