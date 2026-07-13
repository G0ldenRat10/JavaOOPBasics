import java.util.Scanner;

public class class11LogickiOperatori {
    public static void main(String[] args) {
        // Logicki operatori = spajaju dve ili vise ekspresija

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter current temperature:");
        int temp = scanner.nextInt();
        if(temp>30) {
            System.out.println("It is hot outside!");
        } else if(temp>=20 && temp<=30) {
            System.out.println("It is nice weather outside!");
        } else {
            System.out.println("It is cold weather outside!");
        }


        System.out.println("You are playing a game! Press q or Q to quit!");
        String response = scanner.next();
        if (response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game!");
        } else {
            System.out.println("You are still playing the game!");
        }

        // Logika za ! je vec dobro poznata
        // if(!response.equals("q")) ... obrnuta logika

    }
}
