import java.util.Scanner;

/**
 * Created by User on 05.07.2017.
 */
public class task11 {
    public static void main(String[] args) {
        System.out.println("Введите размерность массива");
        Scanner sc = new Scanner(System.in);
        int m = 0;
        if (sc.hasNextInt()) {
            m = sc.nextInt();
            m = Math.abs(m);
        } else {
            System.out.println("Введены некорректные данные");
            System.exit(1);
        }

        System.out.println("Введите целочисленные значения элементов массива");
        int[] argAr = new int[m];

        for (int i = 0; i < m; i++) {
            if (sc.hasNextInt()) {
                argAr[i] = sc.nextInt();
            }
        }
        int summSubZero=0;
        for(int ar: argAr){
            if (ar<0){
                summSubZero+=ar;
            }
        }
        System.out.println("Сумма отрицательных чисел="+summSubZero);
    }
}
