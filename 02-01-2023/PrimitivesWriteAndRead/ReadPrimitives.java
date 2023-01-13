package PrimitivesWriteAndRead;
import java.io.*;
public class ReadPrimitives {
    public static void main(String[] args) {
        DataInputStream in = null;
        try {
            in = new DataInputStream(new FileInputStream("target2.txt"));
            boolean b = in.readBoolean();
            int i = in.readInt();
            char c = in.readChar();
            System.out.println("b: " + b + " int: "+ i+" c: "+c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            if(in!=null) {
                try {
                    in.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
