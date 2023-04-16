import java.util.Scanner;
  
class A {
    int a, b;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num :");
        a = sc.nextInt();
        b = sc.nextInt();
    }

    void add() {
        System.out.println("Addition is :" + (a + b));
    }
}
  

class B extends A {
    int c;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nums :");
        c = sc.nextInt();
    }

    void display() {
        System.out.println("Adition of A , B and C is :" + (a + b + c));
    }
}

class C extends B
{
    int d;
    void show()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num :");
        d=sc.nextInt();
    }
    void show2()
    {
        System.out.println("Adition of A,B, C and D is :" +(a+b+c+d));
    }
} 
public class MultileveInhertance {
    public static void main(String[] args) {
        C obj = new C();
        obj.input();
        obj.getdata();
        obj.show();
        obj.add();
        obj.display();
        obj.show2();
    }
}
