/**
 * Created by User on 05.07.2017.
 */
/**
 * Created by User on 04.07.2017.
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

//Task solving with List interface

public class task13 {
    public static void main(String[] args) {
        // data input
        System.out.println("Введите размерность массива (размерность менее 3 бессмысленна)");
        Scanner sc = new Scanner(System.in);
        int m = 0;
        if (sc.hasNextInt()) {
            m = sc.nextInt();
            if (m < 5) {
                System.out.println("размерность менее 3 бессмысленна");
                System.exit(4);
            }
        }
        else {
            System.out.println("Введены некорректные данные");
            System.exit(3);
        }
        System.out.println("Введите целочисленные значения элементов массива");
        List<Integer> argsList = new ArrayList(m);

        for (int k = 0; k < m; k++) {
            if (sc.hasNextInt()) {
                argsList.add(sc.nextInt());
            }
        }
        //Visual checking
        System.out.println(argsList);

        //Searching for indexes of zero
        int firstZeroIndex=0;
        int sumInterval=0;
        if (argsList.contains(0)){
            firstZeroIndex=argsList.indexOf(0);
            //System.out.println(firstZeroIndex);
        }
        else{
            System.out.println(sumInterval);
            System.exit(10);
        }
        int secondZeroIndex=0;
        if (argsList.subList((firstZeroIndex+1),m).contains(0)){
            secondZeroIndex=firstZeroIndex+2+argsList.subList((firstZeroIndex+1), m).indexOf(0);
            //System.out.println(secondZeroIndex);
        }
        else {
            System.out.println(sumInterval);
            System.exit(11);
        }

        //Sum

        for (int arg: argsList.subList(firstZeroIndex,secondZeroIndex)){
            sumInterval+=arg;
        }
        System.out.println("Сумма между двумя первыми нолями="+sumInterval);

    }
}
