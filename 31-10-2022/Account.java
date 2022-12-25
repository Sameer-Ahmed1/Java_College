public class Account {
    private String id;
    private double balance;
    public Account(String id,double balance){
        this.balance=balance;
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public double getBalance(){
        return this.balance;
    }
    public void withdraw(double withdrawAmount){
        this.balance-=withdrawAmount;
    }
    public void deposit(double depositAmount){
        this.balance+=depositAmount;
    }
}