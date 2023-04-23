abstract class parents
{
    void method()
    {
        System.out.println("Hi this is parents class");
    }
    abstract public void method2();  //it is abstract method.
}
class child extends parents
{
    public void method2()
    {
        System.out.println("Hi this is child class ");
    }
}
public class abstarctClass {
    public static void main(String[] args) {
        child obj = new child();
        obj.method();
        obj.method2();
    }
    
}
