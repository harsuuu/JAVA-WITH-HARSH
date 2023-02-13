import java.util.Scanner;

public class Arthamatic_float {
    public static void main(String[] arg)
    {
        Scanner s=new Scanner(System.in);

        float a,b;
        
        System.out.println("Enter the value of a and b :");

        a=s.nextFloat();
        b=s.nextFloat();
        

        System.out.println("Addition of two float number is :" +(a+b));
        System.out.println("Addition of a and b is :" + (a+b));
        System.out.println("Substraction of a and b is :" + (a-b));
        System.out.println("Multiplication of a and b is :" + (a*b));
        System.out.println("Mode of a and b is :" + (a%b));
        System.out.println("Division of a and b is :" + (a/b));
    }
}
