package class32ObjectPassing;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Car car = new Car("BMW");
        Car car2 = new Car("Tesla");
        // Passing:
        garage.park(car); // BMW
        garage.park(car2); // TESLA
    }
}
