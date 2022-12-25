
public class Test {
    public static void main(String[] args) {
        
        Employee e1 = new Employee("Ram", 5000);
        Manager m1 = new Manager("Sam", 100000);
        System.out.println((e1.getSalaryForMonths(4)));
        System.out.println((m1.getSalaryForMonths(4,50000)));
    }
    
}
