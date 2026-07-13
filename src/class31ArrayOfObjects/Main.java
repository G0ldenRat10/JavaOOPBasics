package class31ArrayOfObjects;

public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        char[] characters = new char[4];
        String[] strings = new String[5];

        // Array of Objects:

        // Precizna dodela praznih mesta:

        Food[] refrigerator = new Food[3]; // 3 prazne pozicije

        // Objects:

        Food food1 = new Food("pizza");
        Food food2 = new Food("gyros");
        Food food3 = new Food("hamburger");

        // SECOND OPTION: Direktna dodela elemenata u array:

        // Food[] refrigerator = {food1,food2,food3};

        // Dodeljivanje na prazne pozicije:

        refrigerator[0] = food1;
        refrigerator[1] = food2;
        refrigerator[2] = food3;

        // Prikaz:

        // Vraca samo adresu gde je u memoriji food1:
        System.out.println(refrigerator[0]);

        // Vraca "pizza":
        System.out.println(refrigerator[0].name);

        // For each petlja da vrati svaki element:

        int foodLenght = refrigerator.length;

        System.out.println("Unutar frizidera nalaze se:");

        for(int i = 0; i < foodLenght; i++) {
            System.out.println(refrigerator[i].name);
        }

    };
};
