package class38AccessModifiers.package2;
import class38AccessModifiers.package1.*; // importuje sve

public class C {
    String defaultMessage = "This is the default"; // no modifier
    public String publicMessage = "This is public";  // Radi globalno jer je public
    protected String protectedMessage = "This is protected"; // Radi samo za subclassi ove klase
    private String privateMessage = "This is private"; // vidljivo samo u samoj klasi
}

/*        MODIFIER        CLASS     PACKAGE      SUBCLASS    WORLD

*         public            Y           Y           Y           Y
*         protected         Y           Y           Y           N
*         no modifier       Y           Y           N           N
*         private           Y           N           N           N
* */
