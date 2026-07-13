import java.util.ArrayList;

public class class20TwoDArrayList {
    public static void main(String[] args) {
        // 2D ArrayList = dinamicne liste unutar liste
        // Mogucnost menjanja velicine liste u toku rada sa istom, dakle ne ostaju prazna mesta
        // vec se dinamcino smanjuje ili raste

        // Gradnja 2D ArrayList objekta:
        ArrayList<ArrayList<String>> partyList = new ArrayList<>();

        // Gradnja klasicnih ArrayList objekata:
        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("Pasta");
        bakeryList.add("Burek");
        bakeryList.add("Donuts");

        ArrayList<String> drugsList = new ArrayList<>();
        drugsList.add("MJ");
        drugsList.add("MDMA");
        drugsList.add("STICKERS");

        ArrayList<String> drinksList = new ArrayList<>();
        drinksList.add("Jameson");
        drinksList.add("Vodka");

        // Popunjavanje 2D ArrayList-a sa obicnim ArrayList-ama:
        partyList.add(bakeryList);
        partyList.add(drugsList);
        partyList.add(drinksList);

        System.out.println(partyList);
        System.out.println(partyList.get(0).get(0)); // Pasta
    }
}
