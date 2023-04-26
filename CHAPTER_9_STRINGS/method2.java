import java.util.Scanner;
public class method2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str;
        System.out.println("Enter the string :");
        str=s.next(); 
        System.out.println(str.substring(3));
        System.out.println(str.substring(3, 7));
        System.out.println(str.replace('a', 'k'));

    }
}
