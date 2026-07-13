package class38AccessModifiers.package1;
import class38AccessModifiers.package2.*; // importuje sve

public class A {
    public static void main(String[] args) {
        // TODO Auto generated method stub
        // Ne radi jer nisu deo istog paketa
        // Potreban je public varijabla

        C c = new C();
        // System.out.println(c.defaultMessage); Ne radi jer je off limits
        System.out.println(c.publicMessage);
    }
}
