package EmployeeThread;

public class Employee implements Runnable {
    private String name;
    private int age;
    private double salary;
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String toString() {
        return "name : " + this.name + " age : " + this.age + " salary : " + this.salary; 
    }
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("current thread" + Thread.currentThread());
            System.out.println("this " + this);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
