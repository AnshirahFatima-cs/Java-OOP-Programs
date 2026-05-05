//Create a class Student with overloaded method displayInfo()
public class Student{
    void displayInfo(String name){
        System.out.println("My name is "+name);
    }
    void displayInfo(String name, int age){
        System.out.println("my name is "+name);
        System.out.println("age is :" + age);
    }
    //— one that takes only name, one that takes name and age, one that takes name,
    // age and grade. Each prints what it receives.
    void displayInfo(String name,int age,char Grade){
        System.out.println("name is : "+name);
        System.out.println("age is : "+age);
        System.out.println("grade is : "+Grade);

    }
    public static void main(String[] args) {
        Student s1=new Student();
                s1.displayInfo("anshirah");
                s1.displayInfo("haya",19);
                s1.displayInfo("tooba ",20,'a');

    }
}
