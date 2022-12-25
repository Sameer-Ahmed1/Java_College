public class CurrentAccount extends Account {

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance, "current" );
    }

    public double withdraw(double amount) {
        if (this.balance - amount < 0) {
            System.out.println("Amount added by bank : " + -(this.balance - amount));
            this.balance = 0;
            return amount;
        }
        this.balance -= amount;
        return amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

}
