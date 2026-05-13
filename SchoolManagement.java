public class SchoolManagement {
    public static void main(String[] args) {
        Teacher t1=new Teacher();
        Student s1=new Student();
        System.out.println("==============");
        System.out.println("---STUDENT DETAILS---");
        s1.setName("anshirah");
        s1.getName();
        s1.setAge(19);
        s1.getAge();
        s1.setAddress("karachi");
        s1.getAddress();
        s1.setGrade('a');
        s1.getGrade();
        s1.setRollNo(2512119);
        s1.getRollNo();
        s1.introduce(); s1.study();
        System.out.println("==============");
        System.out.println("----TEACHER DETAILS----");
        t1.setName("haya");
        t1.getName();
        t1.setAge(23);
        t1.getAge();
        t1.setAddress("karachi");
        t1.getAddress();
        t1.setSalary(25000);
        t1.getSalary();
        t1.setSubject("ICT");
        t1.getSubject();
        t1.introduce(); t1.teach();


    }
}
class Person{
    private String name;
    private int age;
    private String address;
    //getter setter
    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}
    public void setAddress(String address) {this.address = address;}

    int getAge(){return age;}
    String getName(){return name;}
    String getAddress(){return address;}
    void introduce(){
        System.out.println("name is : " + name);
        System.out.println("age is : "+ age);
        System.out.println("address is : "+ address);
    }}
class Student extends Person{
    private int rollNo;
    private char grade;
    public void setRollNo(int rollNo) {this.rollNo = rollNo;}
    public void setGrade(char grade) {this.grade = grade;}
    //getter
    public int getRollNo() {return rollNo;}
    public char getGrade() {return grade;}

    @Override
    void introduce() {
        super.introduce();
        System.out.println("roll no : "+ rollNo);
        System.out.println("grade is : "+ grade);
    }
    void study(){
        System.out.println("student is studying ");
    }
}
class Teacher extends Person{
    private double salary;
    private String subject;
    public void setSubject(String subject) {this.subject = subject;}
    public void setSalary(double salary) {this.salary = salary;}

    public String getSubject(){return subject;}
    public double getSalary() {return salary;}

    @Override
    void introduce() {
        super.introduce();
        System.out.println("subject is : "+subject);
        System.out.println("salary is  : "+salary);
    }
    void teach(){
        System.out.println("teacher is teaching "+ subject);
    }
}
