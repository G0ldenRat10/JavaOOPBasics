package class43DynamicPolymorphism;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // polimorfizam = poly-mnogo; ,morph-oblika
        // Mogucnost objekta da se identifikiju kao vise nego samo jednan tip
        // DINAMICKI = znaci da se objekat menja (polimorfizam) dok se program vec pokrece (during runtime)

        // input setup:
        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("What animal do you want?");
        System.out.println("1 = dog or 2 = cat");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                animal = new Dog();
                break;
            case 2:
                animal = new Cat();
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        animal.speak();

    }


}
