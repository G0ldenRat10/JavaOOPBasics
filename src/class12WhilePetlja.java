import java.util.Scanner;

public class class12WhilePetlja {
    public static void main(String[] args) {
        /// while petlja se vrti sve dok kondicija ne bude jednaka true

        Scanner scanner = new Scanner(System.in);

        String name = "";

        // klasican while:
        while(name.isBlank()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello "+name+ "!");

        do{
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }while(name.isBlank());
        System.out.println("Hello "+name+ "!");
    }
}
