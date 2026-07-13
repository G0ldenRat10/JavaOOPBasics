import java.util.Arrays;

public class class15ListeArrays {
    public static void main(String[] args) {
        // array = lista

        String[] cars = {"Ford","BMW","Tesla"};
        cars[0] = "Mustang";
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);

        // dodela mesta u listi unapred:

        String[] new_cars = new String[3]; // dodata prazna 3 mesta
        new_cars[0] = "Camaro";
        new_cars[1] = "Lada";
        new_cars[2] = "Mazda";
        System.out.println(Arrays.toString(new_cars)); // pretvara iz objekta prikaz njenih vrednosti

    }
}
