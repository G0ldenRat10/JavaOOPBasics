public class class3ZamenaPromenljivih {
    public static void main(String[] args) {
        String x = "water";
        String y = "coca-cola";
        // x=y; // dobijaju se dve coca cole
        String temp = x; // za zamenu dve promenljive koriste se temp promenljive
        x=y;
        y=temp; // sad se menja redosled i x postaje y, a y postaje x
        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }
}
