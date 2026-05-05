class MyEmployee{
   private int id=2512119;
    private String name;
    public MyEmployee(){
        //constructor with name of object
        id=234;
        name="Your-name-here";
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name=n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        this.id=i;
    }
}
public class AccessModifierY{
    public static void main(String[] args) {
        MyEmployee mee=new MyEmployee();
        //       mee.id=2512119;
//       throws an error bcz of private access modifier
//       mee.setName("fatima");
//       mee.setId(2512114);
        System.out.println("name is:" +mee.getName());
        System.out.println("id is:" +mee.getId());
        //constructor



    }
}
