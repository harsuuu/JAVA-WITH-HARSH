import java.util.Scanner;
public class method4 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str1,str2;
        System.out.println("Enter the string 1 :");
        str1=s.next(); 
        System.out.println("Enter the string 2 :");
        str2=s.next();
        System.out.println(str1.equals(str2));
        System.out.println(str1.compareTo(str2));


    }
}
