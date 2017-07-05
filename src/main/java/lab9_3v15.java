/**
 * Created by User on 08.07.2017.
 */
public class lab9_3v15 {
    public static void main(String[] args) {
        int size = (int) ((Math.random() * 100000));
        System.out.println("Размер массива "+size);
        int[] arrRand = new int[size];
        for (int s = 0; s < size; s++) {
            arrRand[s] = (int) (Math.random() * 1000);
        }
        int c = 0;
        int i = -1;
        while (0 == 0) {
            c = 2;
            i++;
            c = (int) (Math.pow(c, i));
            if (c < size) {
                System.out.print(arrRand[c] + "[" + c + "], ");
            } else break;
        }
    }
}
