public class nexted_try_catch {
        public static void main(String[] args) {
            int A[]={10,0,1,23,4};
            try{
                int r=A[3]/A[0];  //Arithmatic exception nhi hai 
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