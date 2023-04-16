class A
{
    void display()
    {
        System.out.println("This is parent class ");
    }
}
class B extends A{
    void display()
    {
        System.out.println("This is child class");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();   //method overriding
        A obj1 = new B();
        obj1.display();   //dynamic method dispatch 

    }
}
