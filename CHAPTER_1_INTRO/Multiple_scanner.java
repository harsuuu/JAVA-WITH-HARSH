import java.util.Scanner;
public class Multiple_scanner {
    
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter Two numbers : ");
        a=input.nextInt();
        b=input.nextInt();
        c=a*b;
        System.out.println("Multiple of two number is : " +c);

    }
}
