/**
 * Created by User on 08.07.2017.
 */
public class lab9_3v27 {
    public static void main(String[] args) {
        int size = (int) ((Math.random() * 20));
        System.out.println("Размер массива " + size);
        int[] arrRand = new int[size];
        for (int s = 0; s < size; s++) {
            arrRand[s] = (int) ((Math.random()-0.5) * 100);
            System.out.print(arrRand[s] + ", ");
        }

        System.out.println();



        int countSubZero = 0;
        int multAboveZero = 1;
        for (int i = 0; i < size; i++) {
            if (arrRand[i] < 0) {
                countSubZero++;
            }
            else  if (arrRand[i] > 0){
                multAboveZero *=arrRand[i];
            }
        }

        System.out.println("Произведение положительных элементов массива равна " + multAboveZero);

        System.out.print("Количество отрицательных элементов массива равно " + countSubZero);
    }
}
