public class CIRCLE {
    double radius;
    public void area(){
        double area=3.14*radius*radius;
        System.out.println("Area is "+area);
    }
    public void circumference(){
        double c=3.14*2*radius;
        System.out.println("Circumference is "+c);
    }
    public static void main(String[] args){
        CIRCLE ana=new CIRCLE();
        //OBJECT 1
        ana.radius=2;
        ana.area();
        ana.circumference();
        //OBJECT 2
        ana.radius=9;
        ana.area();
        ana.circumference();
        //OBJECT 3
        ana.radius=8;
        ana.area();
        ana.circumference();
        //OBJECT 4
        ana.radius=4;
        ana.area();
        ana.circumference();
    }
}
