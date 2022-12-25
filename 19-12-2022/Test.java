public class Test {
    public static void main(String[] args) {
        Customer c1 = new Customer("Sam", "savings", "a1b1", 1200);
        Customer c2 = new Customer("John", "current", "a2b2", 3000);
        Customer c3 = new Customer("Sudeep", "savings", "344", 0);
        c1.getAccount().getDetails();
        c2.getAccount().getDetails();
        c1.getAccount().deposit(500);
        c2.getAccount().deposit(1000);
        System.out.println(c1.getAccount().withdraw(2000));
        System.out.println(c2.getAccount().withdraw(10000));
        c1.getAccount().terminateAccount();
        c2.getAccount().terminateAccount();
    }
}
