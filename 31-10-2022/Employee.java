public class Employee {
    private String name;
    private String id;
    private double salary;
    private static String organisation = "CVR";

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id  = id;
        this.salary = salary;
    }
    public String name() {
        return this.name;
    } 
    public String id() {
        return this.id;
    }
    public double salary(){
        return this.salary;
    }
    public String organisation(){
        return this.organisation;
    }
}