package class47FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("src/class47FileReader/art.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int data = 0;
        try {
            data = reader.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        while (data != -1) {
            System.out.print((char) data);
            try {
                data = reader.read();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            reader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
