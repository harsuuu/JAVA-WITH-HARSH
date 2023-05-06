public class ThrowThrows {
    static int area(int l, int b) throws Exception
    {
        if(l<0 || b<0)
        throw new Exception("Your value is negative");
        return l*b;
    }
    static void math1() throws Exception
    {
        System.out.println("Area is :" +area(-10, 4));
    }
    public static void main(String[] args) throws Exception
    {
        math1();
    }    
}
