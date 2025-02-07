import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int base=sc.nextInt();

        int expo=sc.nextInt();
        Double result=Math.pow(base, expo);
        System.out.print(result);
        sc.close();
    }
}
