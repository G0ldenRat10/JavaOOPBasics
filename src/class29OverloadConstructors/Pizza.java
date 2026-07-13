package class29OverloadConstructors;

public class Pizza {

    // Deklarisanje van konstruktora kako bi bili globalni unutar klase:

    String bread;
    String sauce;
    String cheese;
    String topping;

    // Konstruktor:
    // Overloaded konstruktori:

    // 4 argumenta:
    Pizza(String bread, String sauce, String cheese, String topping) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    };

    // 3 argumenta:
    Pizza(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    };

    // 2 argumenta:
    Pizza(String bread, String sauce) {
        this.bread = bread;
        this.sauce = sauce;
    };

    // 1 argument:
    Pizza(String bread) {
        this.bread = bread;
    };
}
