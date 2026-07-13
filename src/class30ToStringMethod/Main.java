package class30ToStringMethod;

public class Main {
    public static void main(String[] args) {

        // toString(); = Specijalna metoda koju nasledjuju svi objekti,
        //               vraca string koji 'tekstualno" reprezentuje objekat.
        //               Moze se koristiti eksplicitno i implicitno.

        Car car = new Car();

        // print info objekta:
        System.out.println(car.mark);
        System.out.println(car.model);
        System.out.println(car.color);
        System.out.println(car.year);

        // print adresu objekta:
        // nakon toString metode ovo je implicitno:

        System.out.println(car);

        // toString koriscenje:
        // nakon toString metode ovo je eksplicitno:

        System.out.println(car.toString());
    }
}
