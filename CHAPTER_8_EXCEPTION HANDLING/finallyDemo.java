public class finallyDemo {
    public static void main(String[] args) {
        try{
            System.out.println(10);
        }
        // catch(ArithmeticException e)
        // {
        //     System.out.println(e);
        // }
        finally{
            System.out.println("Finally will execute if there is error or not !!");
        }
    }    
}
