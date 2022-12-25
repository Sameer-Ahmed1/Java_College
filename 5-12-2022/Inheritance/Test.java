public class Test {
    public static void main(String[] args) {
        FullTimeEmployee e1 = new FullTimeEmployee("Sam", "Associate", 2015, 30000);
        e1.giveIncentive(2000);;
        e1.getDetails();
        PartTimeEmployee e2  = new PartTimeEmployee("John", "SalesMan", 2020, 10000, "Morning");
        e2.changeShift("Evening");
        e2.getDetails();
    }
}
