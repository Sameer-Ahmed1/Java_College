public class PartTimeEmployee extends Employees {
    private String shift;
    public PartTimeEmployee(String name, String designation, int yearOfJoin, double salary, String shift) {
       super(name, designation, yearOfJoin, salary);
       this.shift = shift;
    }
    public void changeShift(String newShift) {
        this.shift = newShift;
    }
    
}
