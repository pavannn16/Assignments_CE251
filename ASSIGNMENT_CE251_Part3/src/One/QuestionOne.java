package One;
import java.util.*;
abstract class GeomatricObject {
    Scanner sc=new Scanner(System.in);
    public String color;
    public Boolean filled;
    //private Date dateCreated;
    abstract double getArea();
    abstract double getPerimeter();
    protected GeomatricObject()
    {}
    protected GeomatricObject(String c,boolean f)
    {
        color=c;
        filled=f;
    }
    boolean isfilled()
    {
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled=filled;

    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color=color;
    }

}
class circle extends GeomatricObject
{
    private double radius;
    Scanner sc=new Scanner(System.in);
    public circle(){radius=0;}
    public circle(double radius,String color,boolean filled)
    {
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }
    @Override
    public void setColor(String color) {
        // TODO Auto-generated method stub
        super.setColor(color);
    }
    @Override
    public void setFilled(boolean filled) {
        // TODO Auto-generated method stub
        super.setFilled(filled);
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    double getArea()
    {
        return (3.14)*radius*radius;
    }
    double getPerimeter()
    {
        return 2*3.14*radius;
    }
}
class rectangle extends GeomatricObject
{
    Scanner sc=new Scanner(System.in);
    private double width;
    private double height;
    public rectangle()
    {
        width=0;
        height=0;
    }
    public rectangle(double width,double height)
    {
        this.width=width;
        this.height=height;
    }
    public rectangle(double width,double height,String color,boolean filled)
    {
        this.width=width;
        this.height=height;
        this.color=color;
        this.filled=filled;
    }
    @Override
    public String getColor() {
        // TODO Auto-generated method stub
        return super.getColor();
    }
    @Override
    public void setColor(String color) {
        // TODO Auto-generated method stub
        super.setColor(color);
    }
    @Override
    public void setFilled(boolean filled) {
        // TODO Auto-generated method stub
        super.setFilled(filled);
    }
    @Override
    boolean isfilled() {
        // TODO Auto-generated method stub
        return super.isfilled();
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea()
    {

        return height*width;
    }
    public double getPerimeter()
    {
        return 2*(height+width);
    }
}
public class QuestionOne
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("user input");
        circle c = new circle();
        double r;
        String col;
        System.out.print("Enter color of circle : ");
        col=sc.next();
        c.setColor(col);
        System.out.print("Enter radius of circle : ");
        r=sc.nextDouble();
        c.setRadius(r);
        System.out.println("Area of circle : "+c.getArea());
        System.out.println("Perimeter of circle : "+c.getPerimeter());

        rectangle rec = new rectangle();
        double l;
        double b;
        System.out.print("Enter height of rectangle : ");
        l=sc.nextDouble();
        rec.setHeight(l);
        System.out.print("Enter width of rectangle : ");
        b=sc.nextDouble();
        rec.setWidth(b);
        System.out.println("Area of rectangle is : "+rec.getArea());
        System.out.println("Perimeter of rectangle is : "+rec.getPerimeter());

        System.out.println("constructor");
        circle c1=new circle(r,"red",true);
        System.out.println("Area of circle is : "+c1.getArea());
        System.out.println("Perimeter of circle is : "+c1.getPerimeter());

        rectangle rec1=new rectangle(l,b);
        System.out.println("Area of rectangle is : "+rec.getArea());
        System.out.println("Perimeter of rectangle is : "+rec.getPerimeter());

        rectangle rec2=new rectangle(l,b,"blue",true);
        System.out.println("Area of rectangle is : "+rec.getArea());
        System.out.println("Perimeter of rectangle is : "+rec.getPerimeter());
    }
}
