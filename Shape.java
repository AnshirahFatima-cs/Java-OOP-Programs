//Create a parent class Shape with method area() that prints "Calculating area".
public class Shape {
    Shape(){}
    double area(){
        System.out.println("CALCULATING AREA");
        return 0;
    }
    public static void main(String[] args) {
        Shape s1=new Circle(7);
        Shape s2=new Rectangle(4,5);
        s1.area();
        s2.area();
    }
}
//Override it in Circle (area = π × r²) and Rectangle (area = length × width).
// Use parent reference to call child methods like this:
class Circle extends Shape{
    double r;
    double area;
    Circle(double r){
        this.r=r;
    }
    @Override
    double area(){
        area= 3.14*r*r;
        System.out.println("area of circle is : "+area);
        return area;
    }
}
class Rectangle extends Shape{
    double length;
    double width;
    double area;
    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    @Override
    double area(){
        area=length*width;
        System.out.println("area of rectangle is : "+area);
        return area;
    }
}
