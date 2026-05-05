//Create a class Calculator with overloaded methods multiply()
public class Calculator {
    //one that multiplies two integers
    int multiply(int a, int b){
        return a*b;}
    //one that multiplies three integers,
    int multiply(int a, int b, int c){
        return a*b*c;}
    // and one that multiplies two doubles.
    double multiply(double a,double b){
        return a*b;
    }

    public static void main(String[] args) {
        Calculator c1=new Calculator();
        System.out.println("multiplication of  2 integers is : "+c1.multiply(2,3));
        System.out.println(c1.multiply(2.1,2.0));
        System.out.println(c1.multiply(1,2,3));
    }
}
