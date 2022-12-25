public abstract class Account {
    protected String accountNumber;
    protected double balance;
    protected String accountType;
    public Account(String accountNumber, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }
    
    public abstract double withdraw(double amount);
    public abstract void deposit(double amount);
    public  void getDetails() {
        System.out.println("Account Number : " + this.accountNumber + "  Balance is : " + this.balance);
    }
    public void terminateAccount() {
        if(this.balance != 0) {
            System.out.println("Please withdraw remaining balance !");
        }
        else {
            this.balance = 0;
            this.accountNumber = "Terminated Account!";
            System.out.println("Your account has been terminated ");
        }
    }

}
