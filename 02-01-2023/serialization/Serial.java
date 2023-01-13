package serialization;

import java.io.*;

public class Serial {
    public static void main(String[] args) {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("./target.txt"));
            Employee e = new Employee("Sam", 69, 90000);
            System.out.println(e);
            out.writeObject(e);
            out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }

    }
}
