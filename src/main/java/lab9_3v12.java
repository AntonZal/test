/**
 * Created by User on 08.07.2017.
 */
public class lab9_3v12 {
    public static void main(String[] args){
            int[] A={2, 3, 5, 4, 3, 2, 5, 3, 4, 2, 3, 5, 4};
            int count=0;
            for (int a: A){
                if (a == 2) {
                    count++;
                }
            }
            System.out.println("Ко второму экзамену не допущено "+count+" абитуриента(ов)");
    }

}
