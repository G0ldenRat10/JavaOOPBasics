import java.util.ArrayList;

public class class21ForEachPetlja {
    public static void main(String[] args) {
        // sluzi se za iteraciju kroz liste i ostale kolekcije, manje koraka, i lakse se cita nego standardan for-loop

        String[] animals = {"cat","dog","rat","bird"};

        for(String i : animals) {   // for each string in animals  // : = in
            System.out.println(i);
        }

        ArrayList<String> animals2 = new ArrayList<String>();

        animals2.add("elephant"); animals2.add("lion"); animals2.add("rhino");

        for(String i : animals2) {
            System.out.println(i);
        }
    }
}
