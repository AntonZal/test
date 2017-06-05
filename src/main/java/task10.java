/**
 * Created by User on 04.07.2017.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        // data input
        System.out.println("Введите размерность массива (размерность менее 5 бессмысленна)");
        Scanner sc = new Scanner(System.in);
        int m = 0;
        if (sc.hasNextInt()) {
            m = sc.nextInt();
            if (m < 5) {
                System.out.println("размерность менее 5 бессмысленна");
                System.exit(4);
            }
        }
        else {
            System.out.println("Введены некорректные данные");
            System.exit(3);
        }
        System.out.println("Введите целочисленные значения элементов массива");
        ArrayList<Integer> argsList = new ArrayList(m);

        for (int k = 0; k < m; k++) {
            if (sc.hasNextInt()) {
                argsList.add(sc.nextInt());
            }
        }
        //Visual checking
        System.out.println(argsList);

        //Searching for max odd
        int maxOdd=0;
        for(int firstOdd: argsList ) {
            if (firstOdd % 2 == 1) {
                maxOdd = firstOdd;
                break;
            }
        }
        if (maxOdd == 0) {
            System.out.println("Нечетные числа отсутствуют");
            System.exit(2);
        }
        for (int i = argsList.indexOf(maxOdd); i < argsList.size(); i++ ){
            if (argsList.get(i) % 2 == 1){
                if (argsList.get(i) > maxOdd){
                    maxOdd=argsList.get(i);
                }
            }
        }
        System.out.println(maxOdd);

        //Separation of arrayList
        ArrayList<Integer> argsLeftPart = new ArrayList(argsList.indexOf(maxOdd)-1);
        ArrayList<Integer> argsRightPart = new ArrayList(m-1-argsList.indexOf(maxOdd));

        for (int j = 0; j < argsList.indexOf(maxOdd); j++) {
            argsLeftPart.add(argsList.get(j));
        }

        for (int l = (1+argsList.indexOf(maxOdd)); l < argsList.size(); l++){
            argsRightPart.add(argsList.get(l));
        }
        //Visual checking
        System.out.println(argsLeftPart);
        System.out.println(argsRightPart);


        //Shifting
        argsLeftPart.add(0, argsLeftPart.remove(argsLeftPart.size()-1));
        for (int n = 1; n <= 3 ; n++){
            argsRightPart.add(argsRightPart.remove(0));
        }
        //Visual checking
        System.out.println(argsLeftPart);
        System.out.println(argsRightPart);

        //Union
        ArrayList<Integer> argsFinal = new ArrayList(m);
        argsFinal.addAll(argsLeftPart);
        argsFinal.add(maxOdd);
        argsFinal.addAll(argsRightPart);

        System.out.println(argsFinal);

    }
}