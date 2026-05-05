//Create a class Printer with overloaded method print()
public class Printer {
    public static void main(String[] args) {
        Printer p1=new Printer();
        System.out.println(p1.print(5));
        p1.print("ANshirah");
        System.out.println(p1.print(2.3));
    }
    void print(String a){
        System.out.println("my name  is : "+a);
    }
    int print(int a){
        return a;
    }
    double print(double a){
        return a;
    }
}
