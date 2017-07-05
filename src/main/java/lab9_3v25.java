/**
 * Created by User on 08.07.2017.
 */
public class lab9_3v25 {
    public static void main(String[] args) {
        int size = (int) ((Math.random() * 50));
        System.out.println("Размер массива " + size);
        int[] arrRand = new int[size];
        for (int s = 0; s < size; s++) {
            arrRand[s] = (int) (Math.random() * 1000);
            System.out.print(arrRand[s] + ", ");
        }

        System.out.println();

        int[] newArr = new int[size];
        for (int i = 0; i < size; i++) {
            if (arrRand[i] % 2 == 0) {
                newArr[i] = arrRand[i];
            } else {
                newArr[i] = 0;
            }
        }

        for (int nA : newArr) {
            System.out.print(nA + ", ");
        }
    }
}
