package class45FileClass;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        // file = apstraktna reprezentacija fajlova i puteva (pathways) do istog

        File file = new File("secret_file.txt");

        if (file.exists()) {
            System.out.println("This file does exist.");
            System.out.println(file.getAbsolutePath());;
        }
        else {
            System.out.println("This file does not exist.");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            // System.out.println(file.delete());
        }
    }
}
