public class class23OverloadMethods {
    public static void main(String[] args) {
        // overload methods - metode koje dele ista imena ali imaju drugacije parametre,
        // ime metode + parametar = potpis metode

        int x = add(1,2);
        int y = add(1,2,3);
        int f = add(1,2,3,4);
        System.out.println(x);
        System.out.println(y);
        System.out.println(f);
    }

    // Overloaded methods:
    // Ista imena metoda, ali razlicit broj argumenata koji prima metoda:

    static int add(int a, int b) {
        return a + b;
    }
    static int add(int a, int b, int c) {
        return a + b + c;
    }
    static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
