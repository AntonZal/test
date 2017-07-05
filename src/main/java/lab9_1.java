import java.util.Scanner;

/**
 * Created by User on 06.07.2017.
 */
public class lab9_1 {
    public static void main(String[] args){
         final int size = 15;
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[size];
        System.out.println("Введите "+size+" целочисленных значений в массив");
        for (int i=0; i<size; i++){
            if (sc.hasNextInt()){
                arr[i]=sc.nextInt();
            }
            else {
                System.out.println("Неверные данные");
                System.exit(3);
            }
        }
        int count=0;
        for (int j = 1; j < size; j++){
            if ((arr[j] == 1) & (arr[j] == arr[j-1])){
                count++;
            }
        }
        System.out.println("Две единицы подряд встречаются "+count+" раз(а)");
    }
}
