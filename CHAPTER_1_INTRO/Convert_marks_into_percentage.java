import java.util.Scanner;
public class Convert_marks_into_percentage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int sub1, sub2, sub3, sub4 , sub5;

        System.out.println("Enter the marks of all Five subjects : ");

        sub1=s.nextInt();
        sub2=s.nextInt();
        sub3=s.nextInt();
        sub4=s.nextInt();
        sub5=s.nextInt();

        int total=sub1+sub2+sub3+sub4+sub5;

        float percentage=total*100/500;

        System.out.println("Percentage of five subject is : " +percentage);


    }
}
