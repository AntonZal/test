import java.util.Scanner;

/**
 * Created by User on 06.07.2017.
 */
public class lab9_3v11 {
    public static void main(String[] args) {
        int size = 0;
        System.out.println("Введите размер массива");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            size = sc.nextInt();
        }
        double[] arr = new double[size];

        System.out.println("Введите " + size + " значений в массив");
        for (int i = 0; i < size; i++) {
            if (sc.hasNextDouble()) {
                arr[i] = sc.nextDouble();
            } else {
                System.out.println("Неверные данные");
                System.exit(3);
            }
        }

        for (int k=0; k<size; k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();

        double exchange=0;

        for (int j=0; j<size; j+=2){
            exchange=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=exchange;
        }

        for (int l=0; l<size; l++){
            System.out.print(arr[l]+" ");
        }


    }
}