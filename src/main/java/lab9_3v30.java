/**
 * Created by User on 08.07.2017.
 */
public class lab9_3v30 {
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



        int sumOdd = 0;
        int sumSubZero = 0;
        for (int i = 0; i < size; i++) {
            if (arrRandA[i] < 0) {
                sumSubZero+=arrRandA[i];
            }
            if (i % 2 == 1){
                sumOdd +=arrRandB[i];
            }
        }


        System.out.println("Сумма отрицательных элементов массива A равна " + sumSubZero);
        System.out.println("Сумма элементов с нечетными индексами массива B равна " + sumOdd);
    }
}
