package class34Inheritance;

public class Vehicle {

    double speed;
    static String name;

    public Vehicle(String name) {
        this.name = name;
    }


    void go() {
        System.out.println("This "+name+" has stopped.");
    }

    void stop() {
        System.out.println("This "+name+" has stopped.");
    }

}
