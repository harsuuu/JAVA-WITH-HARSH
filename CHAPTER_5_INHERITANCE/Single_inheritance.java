
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

public class Single_inheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.input();
        obj.getdata();
        obj.add();
        obj.display();

    }
}
