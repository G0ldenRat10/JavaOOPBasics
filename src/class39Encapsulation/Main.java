package class39Encapsulation;

public class Main {
    public static void main(String[] args) {

        // Enkapsulizacija = atributi klase ce biti sakriveni ili privatni,
        //                   moze im se pristupiti samo preko metode (geteri i seteri)
        //                   trebalo bi da pravis atribute privatne ako nemas specifican smsiao za njih

        Car car = new Car("Toyota","Supra",2020);

        // System.out.println(car.make); // nece raditi jer je privatizovana informacija u Car.java
        // Resenje je get metoda:
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());


        // car.year = 2022; // nece raditi jer je privatizovana informacija nepromenljiva unutar Car.java
        // Resenje je set metoda:
        car.setYear(2022);
        System.out.println(car.getYear());
    }
}
