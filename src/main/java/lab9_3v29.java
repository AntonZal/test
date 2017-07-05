/**
 * Created by User on 08.07.2017.
 */
public class lab9_3v29 {
    public static void main(String[] args) {
        int size = (int) ((Math.random() * 20));
        System.out.println("Размер массива " + size);
        int[] arrRandA = new int[size];
        for (int s = 0; s < size; s++) {
            arrRandA[s] = (int) ((Math.random()-0.5) * 50);
            System.out.print(arrRandA[s] + ", ");
        }
        System.out.println();
        int[] arrRandB = new int[size];
        for (int s = 0; s < size; s++) {
            arrRandB[s] = (int) ((Math.random()-0.5) * 50);
            System.out.print(arrRandB[s] + ", ");
        }
        System.out.println();



        int sumEven = 0;
        int sumAboveZero = 0;
        for (int i = 0; i < size; i++) {
            if (arrRandB[i] > 0) {
                sumAboveZero+=arrRandB[i];
            }
            if (i % 2 == 0){
                sumEven +=arrRandA[i];
            }
        }


        System.out.println("Сумма элементов с четными индексами массива A равна " + sumEven);
        System.out.println("Сумма положительных элементов массива B равна " + sumAboveZero);
    }
}
