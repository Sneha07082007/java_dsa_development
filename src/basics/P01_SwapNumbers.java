package basics;
import java.util.Scanner ;
import java.sql.SQLOutput;

public class P01_SwapNumbers {
    public static void main( String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a the value of A and B : ");
        int A = sc.nextInt();
        int B =sc.nextInt();
        System.out.println("the value A and B before swaping: "+ A + "and "+ B);

        A = A+B;
        B =A-B;
        A =A-B;
        System.out.println("the value of A and B after swaping:" + A + "and " +B );
        sc.close();
    }
}
