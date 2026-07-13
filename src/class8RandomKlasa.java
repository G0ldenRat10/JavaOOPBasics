import java.util.Random;

public class class8RandomKlasa {
    public static void main(String[] args) {

        Random random  = new Random(); // pseudo random brojevi

        int x = random.nextInt(6)+1; // moze da se limitira velicina (ovo je od 1-6, jer inace krece od 0 do 5)
        System.out.println(x);
        double y = random.nextDouble();
        System.out.println(y);
        boolean z = random.nextBoolean();
        System.out.println(z);
    }
}
