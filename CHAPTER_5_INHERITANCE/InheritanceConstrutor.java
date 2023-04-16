class Grandparent
{
    void Grandparent()
    {
        System.out.println("This is Grand Parents ");
    }
}
class Parents extends Grandparent
{
    void Parents()
    {
        System.out.println("This is Parents");
    }
}
class child extends Parents
{
    void child()
    {
        System.out.println("This is child ");
    }
}
public class InheritanceConstrutor {
    public static void main(String[] args) {
        child obj = new child();
    }   
}
