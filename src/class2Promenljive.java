public class class2Promenljive {
    public static void main(String[] args) {
        int x; // deklaracija promenljive , dodeljivanje tipa
        x = 123; // inicijalizacija promenljive (dodela)
        System.out.println("My number is: " +x);
        long y = 1231516167175161L; // mora L na kraju za velike brojeve
        byte z = 100; // konvertuje int u bajtove
        double pi = 3.14f; // dodaje se f na kraju (float) // dodaje 10 cifara posle tacke
        boolean tf = true; // true/false
        char symbol = '@'; // string simboli
        String word = "John Wick";

        System.out.println("Hello "+word+", did you know that value of Pi is "+pi+"?");

    }
}
