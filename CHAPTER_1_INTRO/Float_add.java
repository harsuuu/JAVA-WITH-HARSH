import java.util.Scanner;

public class Float_add {
    public static void main(String[] arg)
    {
        Scanner s=new Scanner(System.in);

        float a,b,c;
        
        System.out.println("Enter the value of a and b :");

        a=s.nextFloat();
        b=s.nextFloat();
        c=a+b;

        System.out.println("Addition of two float number is :" +c);
    }
}
