public class exception_handling {
    public static void main(String[] args) {
        int a,b,c;
        try{
            a=7;
            b=0;
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divison by zero error " +e);
        }
        System.out.println("Bye");
    }
}
