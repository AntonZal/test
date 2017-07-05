import java.util.Scanner;

/**
 * Created by User on 06.07.2017.
 */
public class math2283 {
    public static void main(String[] args){
        System.out.println("Введите радиус круга");
        double X=0;
        Scanner sc=new Scanner(System.in);
        if (sc.hasNextDouble()){
            X=sc.nextDouble();
        }
        double S=0;
        S=Math.PI*X*X;
        System.out.println(S);
    }
}
