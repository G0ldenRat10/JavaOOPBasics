import java.util.Scanner; // mora da se skine prvo ugradjena klasa skener kako bi se pokretali user inputi

public class class4InputPrintf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scanner.nextLine(); // skenuje sledecu liniju korisnickog inputa gde se ocekuje string
        System.out.println("Hello "+name);
        System.out.println("-----------------------------------------------------------");
        System.out.println("How old are you "+name+ " ?");
        int age = scanner.nextInt(); //  skenuje sledecu liniju korisnickog inputa gde se ocekuje integer
        scanner.nextLine(); // cisti liniju da bude prazna za sledeci unos
        System.out.println("Oh so you are " +age+ " years old!");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Whats your favorite food "+name+ " ?");
        String food = scanner.nextLine();
        System.out.println("Your favorite food is "+food+"!");
        scanner.close();

        // F-STRING (printf)
        String last_name = "Tatomir";
        int year = 24;

        System.out.printf("Hello %s, you are %d years old.", last_name, year);

    }
}
