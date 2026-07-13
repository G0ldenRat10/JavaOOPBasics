package class29OverloadConstructors;

public class Main {
    public static void main(String[] args) {

        // overload constructors = vise konstruktora unutar klase sa istim imenom, ali imaju razlicite parametre
        // ime + parametar = potpis
        // REPLAY : baciti ponovo pogled na overload metode, jer je isti princip

        // Pizza sa 4 sastojka:

        Pizza pizza = new Pizza("sweet bread","tomato","mozzarela","pepperoni");
        System.out.println("Here are ingredients of your pizza: ");
        System.out.printf("%s, %s, %s, %s",pizza.bread,pizza.cheese,pizza.sauce,pizza.topping);
    }
}
