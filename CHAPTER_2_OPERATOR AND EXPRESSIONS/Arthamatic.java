import java.util.Scanner;
class Arthamatic
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner (System.in);

        int a,b;

        System.out.println("Enter two number :");

        a=s.nextInt();
        b=s.nextInt();

        System.out.println("Addition of a and b is :" + (a+b));
        System.out.println("Substraction of a and b is :" + (a-b));
        System.out.println("Multiplication of a and b is :" + (a*b));
        System.out.println("Mode of a and b is :" + (a%b));
        System.out.println("Division of a and b is :" + (a/b));
        
    }

}