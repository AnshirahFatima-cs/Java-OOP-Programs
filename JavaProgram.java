import java.util.Scanner;
public class JavaProgram{

    public static void main(String[] args){
        //write code here
//        System.out.print("the sum is :");
//        int num1=2;
//        int num2=4;
//        int num3=5;
//        int sum=num1+num2+num3;
//        System.out.print(sum);
        //taking input
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 1st number: ");
        int a=sc.nextInt();

        System.out.print("enter 2nd number: ");
        int b=sc.nextInt();

        int sum=a+b;
        System.out.println("the sum is "+sum);





    }
}
