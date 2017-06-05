//**

import java.util.*;


/**
 * Created by User on 04.07.2017.
 */


public class task16 {
    public static void main(String[] args) {
        // data input
        System.out.println("Введите размерность массива");
        Scanner sc = new Scanner(System.in);
        int m = 0;
        if (sc.hasNextInt()) {
            m = sc.nextInt();
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


        List<Integer> newArgsList = new ArrayList<Integer>(m);
        for (int arg:argsList) {
            if ( arg == 0){
                newArgsList.add(0,arg);
            }
            else {
                newArgsList.add(arg);
            }
        }

        System.out.println(newArgsList);

    }
}
