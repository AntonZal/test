
/**
 * Created by User on 05.06.2017.
 * !!!!!!!тут чуток ознакомился с ArrayList, понял минимум
 * !!!!!!!вроде лучше использовать HashMap, но я пока в него не въехал,поэтому говноперебор
 * !!!!!!!типа надо изучить
 */

import java.util.ArrayList;
import java.util.Scanner;

public class task9 {
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
        ArrayList<Integer> ars = new ArrayList(m);

        for (int k = 0; k < m; k++) {
            if (sc.hasNextInt()) {
                ars.add(sc.nextInt());
            }
        }
<<<<<<< HEAD

=======
<<<<<<< HEAD
=======

>>>>>>> bdc141c9098e8347bee30d211cee5dc85e20735f
>>>>>>> 691785416e61a0e54478b17a9a0afd54b7f2b7d9
        System.out.println(ars);
        int count;
        int aboveDouble;
        for (int i = 0; i < ars.size(); i++) {
            count = 0;
            for (int j = 0; j < ars.size(); j++) {
<<<<<<< HEAD
                if (ars.get(j).equals(ars.get(i))) {
=======
<<<<<<< HEAD
                if (ars.get(j) == ars.get(i)) {
=======
                if (ars.get(j).equals(ars.get(i))) {
>>>>>>> bdc141c9098e8347bee30d211cee5dc85e20735f
>>>>>>> 691785416e61a0e54478b17a9a0afd54b7f2b7d9
                    count++;
                }
            }
            aboveDouble = ars.get(i);
            if (count > 2) {
                for (int l = 0; l < ars.size(); l++) {
                    if (ars.get(l) == aboveDouble) {
                        ars.remove(l);
                        l--;
                    }
                }
            }


        }


        System.out.println(ars);

    }
}
