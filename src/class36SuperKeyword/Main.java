package class36SuperKeyword;

public class Main {
    public static void main(String[] args) {

        // super = keyword jeste super klasa (roditelj) od objekta koji je jako slican ovoj recju

        Hero hero1 = new Hero("Batman",40,"Rich");
        Hero hero2 = new Hero("Spiderman",25,"Swinging");
        Person person1 = new Person("Bob",35);

        hero1.signal();
        hero2.signal();

        System.out.println(hero1);
        System.out.println(person1);



    }
}
