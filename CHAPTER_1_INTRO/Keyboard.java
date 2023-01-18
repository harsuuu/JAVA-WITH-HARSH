//Sum of two digit
import java.util.Scanner;

public class Keyboard {
    public static void main(String[] arg)
    {
        Scanner s=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter a and b :");
        a=s.nextInt();
        b=s.nextInt();
        c=a+b;

        System.out.println("Sum of two number is :" + c);
    }
}
