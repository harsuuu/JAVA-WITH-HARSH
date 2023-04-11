//find maximum by method overloading.
public class Method_overloading {
    static int max(int x , int y)
    {
        return x>y?x:y;
    }
    static float max(float x, float y)
    {
        return x>y?x:y;
    }
    static int max(int x, int y, int z)
    {
        return x>y&&x>z?x:(y>z?y:z);
    }
    public static void main(String args[])
    {
        System.out.println("Maximum element in INTEGER datatype is : " + max(10,20));
        System.out.println("Maximum element in FLOAT datatype is : " +max(10.5f,9.5f));
        System.out.println("Maximum is in three of them is :" +max(20,30,40));

    }
    
}
