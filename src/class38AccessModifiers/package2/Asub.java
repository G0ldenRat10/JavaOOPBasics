package class38AccessModifiers.package2;
import class38AccessModifiers.package1.*;  // importuje sve

public class Asub extends A{
    public static void main(String[] args) {
        // TODO Auto generated method stub
        // Radi jer su deo istog paketa

        C c = new C();
        System.out.println(c.defaultMessage);
    }
}
