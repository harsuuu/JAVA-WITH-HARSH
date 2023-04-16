class Rectangle
{
    int length;
    int breadth;

    Rectangle(int length, int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    void display()
    {
        System.out.println("Length is :" +this.length);
        System.out.println("Length is :" +this.breadth);
    }
}
public class thisKeyword {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle(10, 20);
        obj.display();
    }
    
}
