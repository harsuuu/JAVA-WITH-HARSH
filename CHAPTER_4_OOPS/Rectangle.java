class Rectangle1{
    public int length;
    public int breadth;

    public int area()
    {
        return length*breadth;
    }
    public int perimeter()
    {
        return 2*(length+breadth);
    }
}
public class Rectangle {
    public static void main(String[] args) {
        Rectangle1 r=new Rectangle1();

        r.length=10;
        r.breadth=20;

        System.out.println("Area of Rectangle is :" +r.area());
        System.out.println("Perimeter of Rectangle is :" +r.perimeter());
    }
}
