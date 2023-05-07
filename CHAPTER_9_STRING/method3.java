import java.util.Scanner;
public class method3 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str;
        System.out.println("Enter the string :");
        str=s.next(); 
        System.out.println(str.startsWith("www"));
        System.out.println(str.endsWith("com"));
        System.out.println("In this index this character is present :" +str.charAt(4));
        System.out.println("this character is present on this index :" +str.indexOf("g"));

    }
}
