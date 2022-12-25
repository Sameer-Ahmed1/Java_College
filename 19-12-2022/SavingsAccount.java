public class SavingsAccount extends Account {
    public static final double interestRate = 0.05;

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance, "savings");
        this.balance += balance * interestRate;
    }

    public double withdraw(double amount) {
        if (this.balance - amount < 0) {
            System.out.println("You cannot withdraw less than " + this.balance);
            return 0;
        }
        this.balance -= amount;
        return amount;
    }

    public void deposit(double amount) {
        amount += amount * interestRate;
        this.balance += amount;
    }

}
