package class27Constructor;

public class Human {

    String name; int age; double weight;

    // Konstruktor:

    Human(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    };

    void sleep() {
        System.out.printf("%s is sleeping.", this.name);
    };

    void eat() {
        System.out.printf("%s is eating.", this.name);
    };
}
