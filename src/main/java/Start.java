/**
 * Created by User on 03.06.2017.
 */
public class Start {

    public static void main(String[] args) {
        System.out.println("test");

        double count = Math.random();
        int c =(int) (count*10);

        int M=3;
        int sum=0;

        int[] ar=new int[c];

        for (int j=0; j< ar.length; j++){
            ar[j]= (int) (Math.random()*100);
            if (ar[j]>M) {
                sum+=ar[j]*ar[j];
            }
        }


        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
        System.out.println(sum);
    }
}

