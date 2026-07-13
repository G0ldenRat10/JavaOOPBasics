import java.util.Scanner;

public class class7MathKlasa {
//    public static void main(String[] args) {
//        double x = 3.14;
//        double y = -10;
//
//        double z_max = Math.max(x, y); // z postaje veci float izmedju x i y
//        double z_min = Math.min(x, y); // z postaje manji float izmedju x i y
//        System.out.println(z_max); // 3.14
//        System.out.println(z_min); // -10;
//        double z_abs = Math.abs(y); // apsolutna vrednost od y , |y|
//        System.out.println(z_abs);
//        double z_sqrt = Math.sqrt(x);
//        System.out.println(z_sqrt);
//        double z_round = Math.round(x); // ima i .ceil(x) i ima i .floor(x)
//        System.out.println(z_round);
//    }
    public static void main(String[] args) {
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();
        z = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        System.out.println("Z equals to: "+z);
        scanner.close(); // BITNO DA SE SKENER ZATVORI
    }
}
