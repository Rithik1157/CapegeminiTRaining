import java.util.*;
public class perimeter {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        int length=sc.nextInt();
        int width=sc.nextInt();
        int perimeter=2*(length+width);
        System.out.print("Perimeter is: "+perimeter);
        sc.close();
    }
}
