import java.util.*;
public class interest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int principal=sc.nextInt();

        int rate=sc.nextInt();

        int time=sc.nextInt();
        int interest=(principal*rate*time)/100;
        System.out.print("Simple Interest is: "+ interest);
        sc.close();
    }
}
