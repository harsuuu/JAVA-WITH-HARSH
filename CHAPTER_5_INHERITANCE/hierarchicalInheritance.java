import java.util.Scanner;
class A{
    int a, b;
    void input()
    {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter num :");
    a=input.nextInt();
    b=input.nextInt();
    }
}
class B extends A{
    void add()
    {
    System.out.println("Addition is :" +(a+b));
    }
}
class C extends A
{
    void sub()
    {
        System.out.println("Subtaction is :" +(a-b));
    }
}
public class hierarchicalInheritance {
    public static void main(String[] args) {
        B obj = new B();
        // {
            obj.input();
            obj.add();
        // }
        C obj1= new C();

            obj1.input();
            obj1.sub();
        // }
        }
    }