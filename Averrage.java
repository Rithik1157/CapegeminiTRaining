
import java.util.Scanner;

public class Averrage {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Double A=sc.nextDouble();

        Double B=sc.nextDouble();

        Double C=sc.nextDouble();
        Double result=(A+B+C)/3;
        System.out.print("Average is :"+ result);
        sc.close();
    }
}