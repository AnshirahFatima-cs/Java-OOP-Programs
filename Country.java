public class Country {
    String name;
    int population;
    double gdp;
    double inflationRate;
    String currency;
    Country(String name,int population,double gdp,double inflationRate,String currency){
        this.name=name;
        this.population=population;
        this.gdp=gdp;
        this.inflationRate=inflationRate;
        this.currency=currency;
    }
    public void display(){
        System.out.println("country name is : "+name);
        System.out.println("population of country is :"+population);
        System.out.println("gdp is :"+gdp);
        System.out.println("inflation rate is :"+inflationRate);
        System.out.println("currency is :"+currency);
    }
    void gdp(double amount){
        gdp+=amount;
    }
    void compareGdp(Country c){
        if(this.gdp< c.gdp){
            System.out.println(this.name+"has higher gdp than"+ c.name);}
        else{
            System.out.println(c.name+"has higher gdp than"+ this.name);}}
    public static void main(String[] args) {
        Country c1=new Country("pakistan",89990998,83574,84293,"PKR");
        Country c2=new Country("USA",33315246,25000,3.2,"USD");
        Country c3=new Country("china",1400000,18000,2.5,"yuan");
        Country c4=new Country("india",1380000,3400,6.5,"INR");
        Country c5=new Country("UK",6700000,3100,4.0,"pound");
        Country c6=new Country("germany",830000,4200,3.8,"euro");
        Country c7=new Country("japan",1250000,5000,2.0,"yen");
        Country c8=new Country("canada",3800000,2200,3.1,"CAD");
        Country c9=new Country("brazil",2100000,1800.0,5.5,"real");
        Country c10=new Country("australia",2600000,1700.0,2.9,"AUD");
        //display
        c1.display();
        c2.display();
        c3.display();
        c1.compareGdp(c2);
        c2.compareGdp(c3);






    }
}
