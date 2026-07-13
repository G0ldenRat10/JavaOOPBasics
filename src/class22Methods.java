import java.util.Scanner;

public class class22Methods {
    // Glavna metoda:
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String name = "Zaka";
       int age = 24;
       hello(name, age); // static moze da poziva static

       // koriscenje sumNumbers-a:
       System.out.println("Enter number 1: ");
       int x = scanner.nextInt();
       System.out.println("Enter number 2: ");
       int y = scanner.nextInt();
       int z = sumNumbers(x,y);
       System.out.println("Result of "+x+" + "+y+" = "+z);
   }

   // Nasa metoda: // Funkcionise kao funkcija u ostalim programskim jezicima

    static void hello(String word, int number) {
       System.out.println("Hello "+ word+"!");
       System.out.println("You are "+number+" years old.");
    }

    static int sumNumbers(int number1, int number2){
        return number1 + number2;
    }
}
