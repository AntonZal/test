/**
 * Created by User on 08.07.2017.
 */
public class lab9_3v28 {
    public static void main(String[] args) {
        int size = (int) ((Math.random() * 20));
        System.out.println("Размер массива " + size);
        int[] arrRand = new int[size];
        for (int s = 0; s < size; s++) {
            arrRand[s] = (int) ((Math.random()-0.5) * 20);
            System.out.print(arrRand[s] + ", ");
        }

        System.out.println();



        int sumSubZero = 0;
        for (int arr: arrRand){
            if (arr < 0){
                sumSubZero +=arr;
            }
        }

        int multOddIndex=1;
        for (int i = 1; i < size; i+=2) {
            multOddIndex *= arrRand[i];
        }

        System.out.println("Сумма отрицательных элементов массива равна " + sumSubZero);
        System.out.print("Произведение нечетных элементов массива равно " + multOddIndex);
    }
}
