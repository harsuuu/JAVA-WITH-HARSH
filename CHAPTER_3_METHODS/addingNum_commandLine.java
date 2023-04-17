public class addingNum_commandLine {
    public static void main(String[] args) {
        double s=0;
        for(String x:args)
        {
        s=s+Double.parseDouble(x);
        }
        System.out.println("Sum is :" +s);
}
}
