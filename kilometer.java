
import java.util.Scanner;

public class kilometer {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int kilo=sc.nextInt();
        double miles=(kilo*0.621371);
        System.out.println("Mile is: "+miles);
    }

}