public class Marks {
    int sub1;
    int sub2;
    int sub3;
    public double Total(){
        return sub1+sub2+sub3;
    }
    public double Average(){
        return Total()/3;
    }
    public void grades(){
        double avg=Average();
        if(avg>=80){
            System.out.println("A");
        } else if (avg>=60) {
            System.out.println("B");
        }else{
            System.out.println("C");
        }
    }
    public void SetMarks(int s1,int s2,int s3){
        this.sub1=s1;
        this.sub2=s2;
        this.sub3=s3;
    }
    public static void main(String[] args) {
        Marks m1=new Marks();
        m1.SetMarks(10,20,30);
        System.out.println("total marks are is: "+m1.Total());
        System.out.println("Average is : "+m1.Average());
        m1.grades();
    }
}
