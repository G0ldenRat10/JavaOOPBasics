package class35MethodOverriding;

public class Main {
    public static void main(String[] args) {

        // method overriding = Definise se metoda u nizoj klasi, koja je vec dostupna u roditeljskoj klasi
        //                     to se radi kako bi dete klasa mogla da ima svoju implementaciju

        Dog dog = new Dog();
        Animal animal = new Animal();

        // Child class overrited:
        dog.speak();
        // Parent class original:
        animal.speak();
    }
}
