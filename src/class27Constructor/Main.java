package class27Constructor;

public class Main {
    public static void main(String[] args) {

        Human human1 = new Human("Marko",67,75.00);
        Human human2 = new Human("Petar",45,90.00);

        System.out.println(human1.name);
        System.out.println(human2.name);
        human1.sleep();
        System.out.println();
        human2.eat();
    }
}
