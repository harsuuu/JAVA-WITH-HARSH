import java.util.Scanner;

public class Binary {
    public static void main(String[] arg)
    {
        Scanner s=new Scanner(System.in);

        int x;

        System.out.println("Enter binary number");

        s.useRadix(2);

        x=s.nextInt();

        System.out.println("Decimal is :"+x);
    }
}
