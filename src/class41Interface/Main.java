package class41Interface;

public class Main {
    public static void main(String[] args) {
        // interface = templejt koji se moze iskoristiti nad klasom
        //             slicno je nasledju (inheritance), ali naglasava sta klasa moze/mora da uradi
        //             klase mogu da imaju vise od jednog interface-a, nasledje je limitirano samo na 1 super

        Rabbit rabbit = new Rabbit();
        rabbit.flee();
        Hawk hawk = new Hawk();
        hawk.hunt();
        Fish fish = new Fish();
        fish.hunt();
        fish.flee();
    }
}
