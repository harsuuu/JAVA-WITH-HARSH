public class Max_variableArgument {
    static int maximum(int ...A)
    {
        if(A.length==0)  return 0;
        int max=A[0];
        for(int i=1;i<A.length;i++)
        {
            if(A[i]>max)
            {
                max=A[i];
            }
        } return max;
    }
    public static void main(String[] args) {
        System.out.println(maximum(10,20,30));
    }
}
