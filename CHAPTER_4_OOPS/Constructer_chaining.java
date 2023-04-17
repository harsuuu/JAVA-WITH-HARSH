class Test
{
    Test()
    {
    this(2); 
    System.out.println("Default constructor");
    }
    Test(int x)
    {
        this(10,7);
        System.out.println("Value of x is :" +x);
    } 
    Test(int x , int y)
    {
        System.out.println("Addition is :" +(x+y));
    }
}

public class Constructer_chaining {
    public static void main(String[] args) {
        Test t = new Test();
    }
    
}
