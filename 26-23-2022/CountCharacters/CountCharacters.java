package CountCharacters;

import java.io.*;

public class CountCharacters {
    public static void main(String[] args) {
        FileReader in = null;
        try {
            in = new FileReader("input.txt");
            int c = -1;
            int charCount = 0;
            while ((c = in.read()) != -1) {
                charCount++;
            }
            System.out.println("Number of characters in the file is : "+ charCount);
        } catch (IOException e) {
            e.getMessage();
            System.out.println("Cannot find file");
        }
        finally {
            if(in!=null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.getMessage();
                }
            }
        }

    }
}
