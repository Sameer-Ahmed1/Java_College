public class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }
    public double getSalaryForMonths(int months, double bonus) {
        return ((double)this.salary*months ) + bonus;
    }
}
