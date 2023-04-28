public class multiple_catch {
    public static void main(String[] args) {
        int A[]={10,0,1,23,4};
        try{
            int r=A[0]/A[1];  //arithmatic exception
            System.out.println(r);
            System.out.println(A[10]);   // array out of bound
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmatic Exception" +e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array utna hai hi nhi : " +e);
        }
        System.out.println("Bye");
    }    
}
