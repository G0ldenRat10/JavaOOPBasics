package class33StaticKeyword;

public class Friend {
    String name;
    static int numberOfFriends; // da ne bi svaki od njih imao pojedinacno svoj broj, koristi se static za ceo objekat

    Friend(String name) {
        this.name = name;
        numberOfFriends++; // dodaje za jedan broj svaki put kada se napravi novi objekat "Friend"
        // funkcionise jer je static int numberOfFriends ili ti globalno se ne resetuje nakon promena
    }

    static void displayFriends() {
        System.out.println("You have "+numberOfFriends+" friends.");
    }
}
