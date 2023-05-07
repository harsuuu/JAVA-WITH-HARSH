public class nexted_try_catch2 {
    public static void main(String[] args) {
        int A[]={10,0,1,23,4};
        try{
            int r=A[0]/A[1];  //Arithmatic exception 
            System.out.println("Divison is :" +r);
            try{
            System.out.println(A[10]);   // array out of bound
            } 
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Array is out of bound ");
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmatic Exception");
        }
        System.out.println("Bye");
    }    
}
