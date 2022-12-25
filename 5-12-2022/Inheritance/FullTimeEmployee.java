public class FullTimeEmployee extends Employees {
    public FullTimeEmployee(String name, String designation, int yearOfJoin, double salary) {
        super(name, designation, yearOfJoin, salary);
    }
    public void giveIncentive(double incentive) {
        this.salary += incentive;
    }
    
}
