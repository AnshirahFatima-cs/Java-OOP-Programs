public class Rectangle {
    int length;
    int width;
    // to calculate area
    public void area(){
        int area= length*width;
        System.out.println("Area is : "+area);
    }
    public void perimeter(){
        int perimeter= 2*(length*width);
        System.out.println("perimeter is "+perimeter);
    }
    public static void main(String[] args){
        //OBJECT 1
        Rectangle r1=new Rectangle();
        r1.length=4;
        r1.width=3;
        r1.area();
        r1.perimeter();

        //OBJECT 2
        Rectangle r2=new Rectangle();
        r2.length=1;
        r2.width=4;
        r2.area();
        r2.perimeter();
        //OBJECT 3
        r1.length=4;
        r1.width=3;
        r1.area();
        r1.perimeter();

    }
}
