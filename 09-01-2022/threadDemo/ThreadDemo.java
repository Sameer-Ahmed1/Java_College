package threadDemo;
public class ThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        t.setName("sam's thread");
        t.setPriority(1);
        System.out.println(t.getName());
        System.out.println(t.getPriority());
    }
}
