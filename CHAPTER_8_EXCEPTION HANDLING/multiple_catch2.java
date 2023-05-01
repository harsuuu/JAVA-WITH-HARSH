public class multiple_catch2 {
        public static void main(String[] args) {
            int A[]={10,0,1,23,4};
            try{
                int r=A[3]/A[0];  //koi exception nhi hai
                System.out.println("Division is :" +r);
                System.out.println(A[10]);   // array out of bound hai exception hai catch m jayega.
            }
            catch(ArithmeticException e)
            {
                System.out.println("Arithmatic Exception");
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Array utna hai hi nhi : " +e);
            }
            System.out.println("Bye");
        }    
    }
       
