package serialization;
import java.io.*;
public class Deserial {
    public static void main(String[] args) {
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream("target.txt"));
            Employee e1 = (Employee) in.readObject();
            System.out.println(e1);
        } catch (IOException | ClassNotFoundException e) {
                    System.out.println(e);
        }
        finally {
            if(in != null) {
                try {
                    in.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}
