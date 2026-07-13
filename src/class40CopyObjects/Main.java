package class40CopyObjects;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Supra", 2020);
        Car car2 = new Car("BMW", "M5", 2024);

        // car2 = car1; // ovo se ne radi nikad , jer nisi zaista dodelio promenljivu car2 da je car1
        //              // vec si samo pointer u memoriji ubacio da referencira na istu adresu

        car2.copy(car1); // copy metoda unutar klase je resenje problema

        // nakon copy metode i dodate overloaded funkcije i ovo radi:
        // Car car2 = new Car(car1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
    }
}
