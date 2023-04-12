import java.util.Scanner;
class Student1
{
   public int roll_no;
   public  String name;
   public  int m1,m2,m3;
   public String course;

   public int total()
   {
    return m1+m2+m3;
   }
   public float avarage()
   {
    return total()/3;
   }
   public char grade()
   {
    if(avarage()>=60)
    {
        return 'A';
    }
    else 
    {
        return 'B';
    }
   }
   public String details()
   {
     return "Roll no. :"+roll_no+"\n"+"Name :"+name+"\n"+"Course :"+course+"\n";
   }
}
public class Student {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student1 s= new Student1();
        System.out.println("Enter the Roll No. :");
        s.roll_no=input.nextInt();
        System.out.println("Enter the name :");
        s.name=input.next();
        System.out.println("Enter the Course :");
        s.course=input.next();
        System.out.println("Enter the marks of student in Three subject :");
        s.m1=input.nextInt();
        s.m2=input.nextInt();
        s.m3=input.nextInt();
        // s.roll_no=32;
        // s.name="Harsh";
        // s.course="CS";
        // s.m1=100;
        // s.m2=99;
        // s.m3=100;
        
        System.out.println("Total marks is :" +s.total());
        System.out.println("Avarage marks is :" +s.avarage());
        System.out.println("Student grade is :" +s.grade());
        System.out.println("Details of student is : " +s.details());


    }
}
