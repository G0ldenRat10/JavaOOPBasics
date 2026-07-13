package class37AbstractKeyword;

public class Main {
    public static void main(String[] args) {

        // abstract = apstraktna klasa je ona za koju ne mozes da napises new, ona je osnova za
        //            druge klas koje ce je nasledjivati
        //            dodatni sloj bezbednosti unutar tvog programa

        // Stvaranje objekata:

        // Vehicle vehicle = new Vehicle();   // vise nije moguce jer je oznacen "apstract"
        Car car = new Car();

        // Pozivanje metode:
        car.go();
    }
}
