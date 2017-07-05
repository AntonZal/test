import java.util.Scanner;

/**
 * Created by User on 06.07.2017.
 */
public class math2282 {
    public static void main(String[] args){
        System.out.println("Введите желаемое количество разрядов для случайного числа");
        Scanner sc=new Scanner(System.in);
        int N=0;
        if (sc.hasNextInt()){
            N=sc.nextInt();
        }
        int newNumber=0;
        newNumber=(int)(Math.random()*Math.pow(10,N));
        System.out.println(newNumber);

    }
}
