//This is for string but for whole line.
import java.util.Scanner;

public class Stringg {
    public static void main(String[] arg)
    {
        Scanner s=new Scanner(System.in);

        
        String message;
        
        System.out.println("Write you message :");

        message=s.nextLine();

        System.out.println("Welcome!" +message);

    }
}
