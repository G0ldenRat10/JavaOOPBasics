package class44ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // exception = dogadjaj koji se desi u toku izvrsavanja programa
        //             koji zaustavlja normalan tok izvrsavanja
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the number to divide: ");
            int x = scanner.nextInt();
            System.out.println("Enter the number to divide with: ");
            int y = scanner.nextInt();

            int z = x / y;
            System.out.println("Result: "+z);
        } // Specificno koriscenje:
        catch (ArithmeticException e) {
            System.out.println("You can't divide by zero.");
        }
        catch (InputMismatchException e) {
            System.out.println("You have to input a number.");
        } // Lazy Exception, za sve vazi:
        catch (Exception e) {
            System.out.println("There is some error.");
        } // Ovo se uvek printuje:
        finally {
            System.out.println("Program has finished.");
            scanner.close();
        }
    }
}