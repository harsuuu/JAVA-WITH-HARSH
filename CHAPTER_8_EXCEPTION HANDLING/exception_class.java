import java.util.Scanner;

class MyException extends Exception
{
    public String tostring()
    {
        return "I am string()";
    }
    public String getMessage()
    {
        return "I am getMessage()";
    }
}
public class exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entet the number :");
        a=sc.nextInt();
        if(a<9)
        {
            try
            {
                throw new MyException();
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
                System.out.println(e);
            }
        }
    }
}
