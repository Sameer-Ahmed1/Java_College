package CountLines;
import java.io.*;
public class CountLines {
    public static void main(String[] args) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("input.txt"));
            String line;
            int numberOfLines=0;
            while((line = in.readLine())!=null){
                numberOfLines++;
            }
            System.out.println("Number of lines : " + numberOfLines);

        } catch (IOException e) {
            e.getMessage();
        }
        finally {
            if(in!=null) {
                try {
                    in.close();
                } catch (Exception e) {
                    e.getMessage();
                }
            }
        }
        
    }
}
