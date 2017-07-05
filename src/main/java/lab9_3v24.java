import java.util.Scanner;

/**
 * Created by User on 08.07.2017.
 */
public class lab9_3v24 {
    public static void main(String[] args) {
        int size = (int) ((Math.random() * 50));
        System.out.println("Размер массива " + size);
        int[] arrRand = new int[size];
        for (int s = 0; s < size; s++) {
            arrRand[s] = (int) (Math.random() * 1000);
            System.out.print(arrRand[s] + ", ");
        }

        System.out.println();
        int indexMin = 0;
        int min = arrRand[indexMin];
        for (int i = 1; i < size; i++) {
            if (arrRand[i] < min) {
                indexMin = i;
                min=arrRand[i];
            }
        }

        System.out.print("минимальный элемент массива: " + arrRand[indexMin] + "[" + indexMin + "]");
    }
}
