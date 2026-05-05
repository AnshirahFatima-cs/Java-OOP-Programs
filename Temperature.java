public class Temperature {
    public double celsiusToFahrenheit(double c){
        return (c*9/5)+32;
    }
    public double FahrenheitToCelsius(double f){
        return (f-32)*5/9;
    }
    public static void main(String[] args) {
        Temperature t1=new Temperature();
        double c=99;
        double f=88;
        System.out.println("celsius To Fahrenheit is :"+t1.celsiusToFahrenheit(c));
        System.out.println("Fahrenheit To Celsius is: "+t1.FahrenheitToCelsius(f));
    }
}
