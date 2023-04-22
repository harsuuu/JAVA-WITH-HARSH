import java.util.*;

import javax.sound.sampled.SourceDataLine;
abstract class shape
{
    abstract public double area();  // they are abstract method.
    abstract public double perimeter();  //they are abstract method.
}
class circle extends shape{
    double radius;
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
}
class rectancle extends shape
{
    double length;
    double breadth;

    public double area()
    {
        return length*breadth;
    }
    public double perimeter()
    {
        return 2*(length+breadth);
    }
}
public class questionAbstract {
    public static void main(String[] args) {
        rectancle r = new rectancle();
        r.breadth=10;
        r.length=3;
        System.out.println("Area of rectangle is :" +r.area());
        System.out.println("Perimeter of rectangle is :" +r.perimeter());

        circle c= new circle();
        c.radius=2;
        System.out.println("Area of circle is :" +c.area());
        System.out.println("Perimeter of circle is :" +c.perimeter());

    }
}
