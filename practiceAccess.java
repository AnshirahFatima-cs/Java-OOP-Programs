//question 1
//CREATE A CLASS CYLINDER AND USE GETTER AND SETTER TO SET ITS RADIUS AND HEIGHT
class cylinder{
    private int radius;
    private int height;

//problem 3 constructor
    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double surfaceArea(){
        return 2*3.14*radius*radius+2*3.12*radius*height;
    }
    public double volume(){
        return 3.14*radius*radius*height;
    }
}
class rectangle{
    int length;
    int breadth;
    public rectangle(){
        this.length=4;
        this.breadth=5;
    }
    public rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
public class practiceAccess {
    public static void main(String[] args) {
        //question 1
        //CREATE A CLASS CYLINDER AND USE GETTER AND SETTER TO SET ITS RADIUS AND HEIGHT
        cylinder cr=new cylinder(9,12);
//        cr.setHeight(12);
        System.out.println("height is : "+cr.getHeight());
//        cr.setRadius(9);
        System.out.println("radius is : "+cr.getRadius());
        //problem 2 surface area
        System.out.println("surface area is : "+cr.surfaceArea());
        //print volume
        System.out.println("volume is : "+cr.volume());

        //problem 4
        rectangle rec=new rectangle(12,9);
        System.out.println(rec.length);
        System.out.println(rec.breadth);
    }
}
