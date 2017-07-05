import java.util.Scanner;

/**
 * Created by User on 06.07.2017.
 */
public class math2281 {
    public static void main(String[] args) {
        int headCount=0;
        System.out.println("Введите количество заголовков новостей");
        Scanner sc=new Scanner(System.in);
        if (sc.hasNextInt()){
            headCount=sc.nextInt();
            headCount=Math.abs(headCount);
        }
        else{
            System.out.println("Введены некорректные данные");
        }
        int pages=0;
        if (headCount % 10 == 0){
            pages=headCount / 10;
        }
        else {
            pages=(int)(headCount/10)+1;
        }
        System.out.println(pages);

    }
}
