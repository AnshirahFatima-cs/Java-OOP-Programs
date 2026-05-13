public class AtmMachine {
    public static void main(String[] args) {
        ATM a=new ATM(1234,2000,1234);
        a.checkBalance();
        a.deposit(500);
        a.checkBalance();
        a.withdraw(1000);
        a.checkBalance();
        a.changePin(1234,3456);

    }
}
class ATM{
    private int accountNo;
    private double balance;
    private int pin;
    ATM(int accountNo,double balance,int pin){
        this.accountNo=accountNo;
        this.balance=balance;
        this.pin=pin;

    }
    //setter getter
    public void setAccountNo(int accountNo) {this.accountNo = accountNo;}

    public void setPin(int pin) {
        if (pin>=1000 && pin<=9999) {
            this.pin = pin;
        } else {
            System.out.println("pin should be atleast 4 digits ");
        }
        }
        int getPin(){return pin;}

    public void setBalance(double balance) {
        if(balance>0){
        this.balance = balance;
    }else{
            System.out.println(" INVALID BALANCE ");}}
    public double getBalance() {return balance;}

    void checkBalance(){
        System.out.println("current balance is : "+balance);
    }
    double deposit(double amount){
        if(balance>0){
            System.out.println("DEPOSIT SUCCESSFULL");
            return balance+=amount;
        }
        else{
            System.out.println("invalid balance----");
            return 0;
        }
    }
    double withdraw(double amount){
        if(balance>amount){
            return balance-=amount;
        }else{
            System.out.println("invalid balance");
            return 0;}
    }
    public void changePin(int oldPin, int newPin) {
    if (this.pin == oldPin) {

        // Check new PIN validation
        if (newPin >= 1000 && newPin <= 9999) {
            this.pin = newPin;
            System.out.println("PIN changed successfully.");
        } else {
            System.out.println("New PIN must be exactly 4 digits.");
        }

    } else {
        System.out.println("Incorrect old PIN.");
    }
}}


