import java.util.Scanner;
public class method {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str;
        System.out.println("Enter the string :");
        str=s.next(); 
        System.out.println("Length is :" +str.length());
        System.out.println("It will chnage into lowercase : "+str.toLowerCase());
        System.out.println("It will chnage into Uppercase : "+str.toUpperCase());
        System.out.println(str.trim());

    }
}
