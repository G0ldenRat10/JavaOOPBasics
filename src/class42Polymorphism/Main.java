package class42Polymorphism;

import class38AccessModifiers.package1.B;

public class Main {
    public static void main(String[] args) {

        // polimorfizam = poly-mnogo; ,morph-oblika
        // Mogucnost objekta da se identifikiju kao vise nego samo jednan tip

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        // sva tri objekta se indetifikuju sem kao sami svojim imenom i super-klasom Vehicle
        // te se moze storovati u array Vehicle kao tip

        Vehicle[] racers = {car,bicycle,boat};

        for(Vehicle x: racers) {
            x.go();
        }

    }
}
