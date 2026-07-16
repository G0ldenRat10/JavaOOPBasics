package class46FileWritter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("/home/fibonnaci/Programs/JavaOOPBasics/poem.txt");
            writer.write("Roses are red. \n Violets are blue " );
            writer.append("\n I love programming and so do you.");
            writer.flush(); // isprazni buffer i upiši podatke u fajl
            writer.close(); // zatvori fajl
            System.out.println("✅ Fajl je uspešno napisan!");
        } catch (IOException e) {
            System.out.println("❌ Greška pri pisanju u fajl!");
            e.printStackTrace();
        }
    }
}
