public class class24Printf {
    public static void main(String[] args) {
        // Primer:
        int num = 123;
        System.out.printf("This is a number %d", num);

        // Konverzija karakterna:

        // System.out.printf("%b", myBoolean);
        // System.out.printf("%c", myChar);
        // System.out.printf("%s", myString);
        // System.out.printf("%d", myInt);
        // System.out.printf("%f", myDouble);

        // Sirina - minimalan broj karaktera da budu uneseni kao output:

        //System.out.printf("Hello %10s", myString);

        // Preciznost - koliko ce brojeva biti posle zareza u Double brojevima

        //System.out.printf("You have this much money %.2f", myDouble);

        // Zastavice - dodaje efekat outputu u zavisnosti od zastavice

        // - : pomeri da pocinje ulevo od pocetka, bez - je udesno (left-justify)
        //System.out.printf("You have this much money %-20f", myDouble);

        // + : izbacuje u zavisnosti da li je broj pozitivan ili negativan (+) ili (-) ispred datig broja
        //System.out.printf("You have this much money %+f", myDouble);

        // 0 : na sva slobodna mesta dodaje nule ispred pre samog broja
        //System.out.printf("You have this much money %020f", myDouble);

        // , : na sve nule koje predju 1000 dodaje se zarez
        //System.out.printf("You have this much money %,f", myDouble);

    }
}
