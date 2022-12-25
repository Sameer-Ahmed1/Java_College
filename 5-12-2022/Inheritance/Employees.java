public class Employees {
    protected String name;
    protected String designation;
    protected int yearOfJoin;
    protected double salary;

    public Employees(String name, String designation, int yearOfJoin, double salary) {
        this.name = name;
        this.designation= designation;
        this.yearOfJoin = yearOfJoin;
        this.salary = salary;
    }
    public void incrementSalary(double percentage) {
        this.salary += this.salary*percentage;
    }
    public void getDetails() {
        System.out.println(this.name + " "+ this.designation+" "+ this.yearOfJoin + " "+ this.salary);
    }
}