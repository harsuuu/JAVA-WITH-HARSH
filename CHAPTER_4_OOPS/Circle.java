import java.util.Scanner;
class Circle1
{
    public double radius;

    public double area()
    {
        return Math.PI*radius*radius;
    }

    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
}
public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        Circle1 c =new Circle1();

    
        // we can create multiple object.
        // Circle1 c1= new Circle1();
        // phir iske hisab se bhi value dekr print kr skte hai.

        System.out.println("Enter the Radius of Circle is :");

        c.radius=input.nextInt();

        System.out.println("Area of Circle is : " +c.area());
        System.out.println("Perimeter of Circle is : " +c.perimeter());


    }
}
