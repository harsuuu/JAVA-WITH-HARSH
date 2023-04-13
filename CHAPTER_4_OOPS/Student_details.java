import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
class Student{
    public String name;
    public int age;
    public int roll_no;
    public int m1,m2,m3;

    public void input()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the name :");
        name=s.next();
        System.out.print("Enter the age :");
        age=s.nextInt();
        System.out.print("Enter the roll_no. :");
        roll_no=s.nextInt();
        System.out.print("Enter the marks :");
        m1=s.nextInt();
        m2=s.nextInt();
        m3=s.nextInt();
    }
    public void display()
    {
        System.out.println("Name is : " +name);
        System.out.println("Age is : "+age);
        System.out.println("Roll no is :" +roll_no);
    }
    public void total()
    {
        System.out.println("Total marks is :" +(m1+m2+m3));
    }
}
public class Student_details {
    public static void main(String[] args) {
        // Scanner obj = new Scanner(System.in);
        Student s[] = new Student[5];
        
            for(int i=0;i<5;i++)
            {
                s[i]=new Student();
                s[i].input();
                s[i].display();
                s[i].total();

            }
        

    }
}
