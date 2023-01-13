package serialization;
import java.io.*;
public class Employee implements Serializable{
    private String name;
    private int age;
    private static String organisation = "CVR";
    private transient double salary;
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String toString() {
        return ("Name: " + this.name + " age: " + this.age + " salaray: "+ this.salary + " org " + Employee.organisation);
    }
}