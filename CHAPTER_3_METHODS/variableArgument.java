public class variableArgument {
    static void show(int ...x)
    {
    for(int a:x)
    {
        System.out.println(a);
    }
}
    public static void main(String[] args) {
        show(10,20,30);
    }
}
