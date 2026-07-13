public class class18WrapperKlase {
    public static void main(String[] args) {
        // primitivni podaci:   wrapper podaci:
        //  int                  Integer
        //  double               Double
        //  char                 Char
        //  boolean              Boolean
        //  ...                   ...

        // Primitivni cuvaju direktno vrednost i brzi su, trose manje memorije, NEMAJU metode.
        // Wrapperi predstavljaju objekte, trose vise memorije,mogu imati vrednost null, IMAJU metode.

        // Autoboxing : pretvara primitive ---> wrapper
        // Unboxing :   pretvara wrapper   ---> primitive

        // Autoboxing:

        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Zaka"; // uvek je wrapper String

        // Unboxing:

        if(a==true) {
            System.out.println("This is true.");
        }
        if(b=='@') {
            System.out.println("This is true.");
        }
    }
}
