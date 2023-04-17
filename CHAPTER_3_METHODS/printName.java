public class printName {
    static void show(String ...x)
    {
        for(String s :x)
        {
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        show("Harsh","Joshi","Aarav","Ravindra","Madhav");
    }
}
