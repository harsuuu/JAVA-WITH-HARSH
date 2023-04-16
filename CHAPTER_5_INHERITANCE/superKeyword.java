class Rectangle
{   
    int x=10;
}
class Cuboid extends Rectangle
{
    int x=20;
    void display()
    {
        System.out.println("x is : " +(super.x));
        System.out.println("x is : " +x);
    }
}
public class superKeyword {
    public static void main(String[] args) {
    Cuboid obj = new Cuboid();
    obj.display();
}
    }
    
