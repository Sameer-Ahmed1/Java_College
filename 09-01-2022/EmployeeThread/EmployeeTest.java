package EmployeeThread;

public class EmployeeTest {
    public static void main(String[] args) {
        Runnable e1 = new Employee("sam", 20, 500000);
        Runnable e2 = new Employee("Dam", 21, 600000);
        Runnable e3 = new Employee("Pam", 22, 700000);
        Thread t1 = new Thread(e1, "one");
        Thread t2 = new Thread(e2, "two");
       // Thread t3 = new Thread(e3, "three");
        t1.start();
        t2.start();
        //t3.start();
        System.out.println(t1.getName() + " is alive " + t1.isAlive());
        System.out.println(t2.getName() + " is alive " + t2.isAlive());
        //System.out.println(t3.getName() + " is alive " + t3.isAlive());
        try {
            t1.join();
            t2.join();
          //  t3.join();
        
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t1.getName() + " is alive " + t1.isAlive());
        System.out.println(t2.getName() + " is alive " + t2.isAlive());
        //System.out.println(t3.getName() + " is alive " + t3.isAlive());
        System.out.println("end of main thread ");
    }
}
