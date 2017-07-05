import java.util.Scanner;

/**
 * Created by User on 08.07.2017.
 */
public class lab9_3v14 {
    public static void main(String[] args) {
        System.out.println("Введите количество уравнений");
        Scanner sc = new Scanner(System.in);
        int size = 0;
        if (sc.hasNextInt()) {
            size = sc.nextInt();
            size = 2 * Math.abs(size);
        }
        int[] argFuncArr = new int[size];
        for (int s = 0; s < size; s += 2) {
            System.out.println("Введите значение аргумента");
            if (sc.hasNextInt()) {
                argFuncArr[s] = sc.nextInt();
            }
            System.out.println("Введите значение функции");
            if (sc.hasNextInt()) {
                argFuncArr[s + 1] = sc.nextInt();
            }
        }
        for (int i=0; i<size; i+=2){
            System.out.print(argFuncArr[i]+"          "+argFuncArr[i+1]);
            System.out.println();
        }
    }
}