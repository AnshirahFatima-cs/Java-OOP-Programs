import java.util.Scanner;
public class HospitalAdv {
    public static void main(String[] args) {
        Hospital h=new Hospital();
        h.runSystem();
    }
}
abstract class Doctor{
    String name;
    String specialization;
    Doctor(String name,String specialization){
        this.name=name;
        this.specialization=specialization;
    }
    abstract void treat();
    void introduce(){
        System.out.println("HELLO-- my name is : "+ name);
        System.out.println("my specialization is : "+specialization);
    }
}
class Surgeon extends Doctor{
    Surgeon(String name,String specialization){
        super(name, specialization);
    }
    @Override
    void treat(){
        System.out.println("performing surgery on patients");
    }
}
class Dentist extends Doctor{
    Dentist(String name,String specialization){
        super(name, specialization);
    }
    @Override
    void treat(){
        System.out.println("treating patients teeth");
    }
}
class Cardiologist extends Doctor{
    Cardiologist(String name,String specialization){
        super(name, specialization);
    }
    @Override
    void treat(){
        System.out.println("treating patients heart");
    }
}
class Hospital{
    Surgeon s=new Surgeon("dr yusra","surgery");
    Dentist d=new Dentist("dr haya","dentistry");
    Cardiologist c=new Cardiologist("dr tooba","cardiology");
    int totalTreatments=0;
    Scanner sc=new Scanner(System.in);
    void display(){
        System.out.println("==========");
        System.out.println("  hospital management ");
        System.out.println("1.surgeon");
        System.out.println("2.dentist");
        System.out.println("3.cardiologist");
        System.out.println("4.exit");
        System.out.println("==============");
        System.out.println("choose doctor");
    }
    void runSystem(){
        while(true){
            display();
            int choice= sc.nextInt();
            switch (choice){
                case 1:
                    s.introduce();
                    s.treat();
                    totalTreatments++;
                    break;
                case 2:
                    d.introduce();
                    d.treat();
                    totalTreatments++;
                    break;
                case 3:
                    c.introduce();
                    c.treat();
                    totalTreatments++;
                    break;
                case 4:
                    System.out.println("exiting hospital system");
                    displaySummary();
                    return;
                default:
                    System.out.println("invalid options! try again");
            }
        }
    }
    void displaySummary(){
        System.out.println("===========");
        System.out.println("SUMMARY");
        System.out.println("treatment done = "+totalTreatments);
        System.out.println("==============");
    }
}

