package class36SuperKeyword;

public class Hero extends Person{

    String power;

    Hero(String name,int age, String power) {
        super(name,age); // nasledjuje se iz roditelj Klase (super-keyword)
        this.power = power;
    }

    public String toString() {
        return name + "\n" + age + "\n" + power + "\n";
    }
    void signal() {
        System.out.println("The "+name+" signal is on!");
    }
}

