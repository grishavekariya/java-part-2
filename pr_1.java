/*ID NO: 21CE153
NAME: Grisha Vekariya
AIM : Design a class named Circle containing following attributes and behavior.
•One double data field named radius. The default valueis1.
•A no-argument constructor that creates a default circle.
•A Single argument constructor that creates a Circle with the     
specified radius.
•A method named getArea() that returns area of the Circle.
•A method named getPerimeter() that returns perimeter of it*/

public class pr_1
{
	public static void main(String[] args)
	{
	      Circle c= new Circle();
	      Circle c1= new Circle(3);
	      System.out.println("Area of circle is:"+c1.getArea());
	      System.out.println("perimeter of circle is:"+c1.getPerimeter());
	      
	}
}
 class Circle
{
    double radius;
    public Circle()
    {
        radius=1;
        System.out.println(radius);
    }
    public Circle(double r)
    {
        radius=r;
        System.out.println("radius is:"+radius);
    }
    public double getArea()
    {
        double area;
        area=(1.33*3.14*radius*radius*radius);
        return area;
    }
    public double getPerimeter()
    {
        return(6.28*radius);
    }
}



