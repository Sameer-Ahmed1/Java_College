package PrimitivesWriteAndRead;
import java.io.*;
public class WritePrimitives {

    public static void main(String[] args) {
        DataOutputStream out = null;
        try {
            out = new DataOutputStream(new FileOutputStream("target2.txt"));
            out.writeBoolean(true);
            out.writeInt(35);
            out.writeChar('A');
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(out!=null) {
                try {
                    out.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}