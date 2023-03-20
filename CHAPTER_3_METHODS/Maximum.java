public class Maximum 
{
   static int max(int x, int y)
    {
        if(x>y)
        {
            return x;
        }
        else
        {
            return y;
        }
    }
    public static void main(String args[])
    {
        int a=10; 
        int b=20;
        int c=max(a,b);

        System.out.println("Maximum of two number is :" +c);
    }
}

