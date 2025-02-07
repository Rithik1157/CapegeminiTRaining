
import java.util.Scanner;

public class celsius {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double celsius=sc.nextDouble();
        Double Fahreneit=(celsius*9/5)+32;
        System.out.println("Fahrenhiet :"+Fahreneit);
        sc.close();
    }
}
