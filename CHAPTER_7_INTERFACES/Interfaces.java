
interface test1
{
    void method1();
    void method2();
}
class test2 implements test1{
    public void method1()
    {
        System.out.println("Method1 of test2 class ");
    }
    public void method2()
    {
        System.out.println("method2 of test2 class  ");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        test2 t = new test2();
        t.method1();
        t.method2();
    }
}
