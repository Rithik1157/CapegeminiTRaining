import java.util.*;
public class vollume {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int radius=sc.nextInt();

        int height=sc.nextInt();
        Double volume = (3.14*(radius*radius)*height);
        System.out.print("Volume is: "+volume);
        sc.close();
    }
}
