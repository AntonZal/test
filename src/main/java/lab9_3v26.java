/**
 * Created by User on 08.07.2017.
 */
public class lab9_3v26 {
    public static void main(String[] args) {
        int size = (int) ((Math.random() * 30));
        System.out.println("Размер массива " + size);
        int[] arrRand = new int[size];
        for (int s = 0; s < size; s++) {
            arrRand[s] = (int) ((Math.random()-0.5) * 1000);
            System.out.print(arrRand[s] + ", ");
        }

        System.out.println();



        int sumEven = 0;
        int sumAboveZero = 0;
        for (int i = 0; i < size; i++) {
            if (arrRand[i] > 0) {
                sumAboveZero+=arrRand[i];
            }
            if (arrRand[i] % 2 == 0){
                sumEven +=arrRand[i];
            }
        }

        System.out.println("Сумма положительных элементов массива равна " + sumAboveZero);
        System.out.print("Сумма четных элементов массива равна " + sumEven);
    }
}
