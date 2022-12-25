public class Customer {
    private String name;
    private Account ac;
    public Customer(String name, String accountType, String accountNumber, double balance) {
        this.name = name;
        if(accountType.toLowerCase() == "savings"){
            this.ac.accountType = accountType;
            ac = new SavingsAccount(accountNumber, balance);
        }
        else if(accountType.toLowerCase() == "current") {
            this.ac.accountType = accountType;
            ac = new CurrentAccount(accountNumber, balance);
        }
    }
    public Account getAccount() {
        return ac;
    }
    
}
