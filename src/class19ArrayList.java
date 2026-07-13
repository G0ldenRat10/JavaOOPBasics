import java.util.ArrayList;

public class class19ArrayList {
    public static void main(String[] args) {
        // ArrayList = lista koja moze da se menja, ili ti nije niz nego bas LISTA (promenjljiv niz)
        // Elementi se mogu dodavati i sklanjati nakon faze izgradnje
        // Cuvaju se i reference drugih podataka

        ArrayList<String> food = new ArrayList<String>(); // napravljen objekat

        food.add("pizza"); food.add("hamburger"); food.add("hotdog");

        food.set(0, "sushi"); // pizza ---> sushi

        food.remove(2); // hotdog ---> brise se

        food.clear();         // brisu se svi elementi u listi

        for(int i=0; i<food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
