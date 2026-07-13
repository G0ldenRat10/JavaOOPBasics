package class33StaticKeyword;

public class Main {
    public static void main(String[] args) {

        // static = keyword modifikator. Jedna kopija varijable ili metode je kreirana i deli se.
        //          Klasa poseduje staticnog clana.

        Friend friend1 = new Friend("Lelo");
        Friend friend2 = new Friend("Ika");
        Friend friend3 = new Friend("Figo");
        System.out.println(Friend.numberOfFriends);
        Friend.displayFriends();
    }
}
