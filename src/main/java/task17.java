import java.util.Scanner;

public class task17 {
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
        int[] ar = new int[m];

        for (int i = 0; i < m; i++) {
            if (sc.hasNextInt()) {
                ar[i] = sc.nextInt();
            }
        }


        int arMin=ar[0];
        int arMax=ar[0];
        int indexMin=0;
        int indexMax=0;
        for (int j = 1; j < m; j++){
            if (ar[j] < arMin){
                arMin=ar[j];
                indexMin=j;
            }
            else if (ar[j] > arMax){
                arMax=ar[j];
                indexMax=j;
            }
        }
        int countMin=0;
        int countMax=0;
        for (int arg: ar){
            if (arMax == arg) {
                countMax++;
            }
            else if (arMin == arg){
                countMin++;
            }
        }
        if ((countMax>1)||(countMin>1)){
            System.out.println("Вы ввели более одного максимального или минимального значения");
        }
        else {
            System.out.print("Сумма номеров максимального и минимального значений=");
            System.out.println(indexMax+indexMin);
        }
    }
}