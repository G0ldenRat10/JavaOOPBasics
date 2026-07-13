public class class17StringMetode {
    public static void main(String[] args) {
        // provere jednakosti stringa

        String name = "Zaka";
        boolean result = name.equals("Zaka");
        System.out.println(result);
        boolean result2 = name.equalsIgnoreCase("Zaka");
        System.out.println(result2);

        // duzina stringa

        int result3 = name.length();
        System.out.println(result3);

        // vrati samo jedan karakter iz stringa

        char result4 = name.charAt(1); // a
        System.out.println(result4);

        // vrati na kom mestu se nalazi taj karakter

        int result5 = name.indexOf("Z"); // 0
        System.out.println(result5);

        // provera da li je string prazan

        boolean result6 = name.isEmpty();
        System.out.println(result6);

        // Pretvaranje u lowercase i uppercase sve stringove date

        String result7 = name.toLowerCase();
        String result8 = name.toUpperCase();
        System.out.println(result7+" "+result8);

        // Trimovanje pocetka i kraja reci , gde brise empty space pre i posle

        String result9 = name.trim();
        System.out.println(result9);

        // Menjanje specificnog karaktera sa nekim odredjenim koji mi nametnemo

        String result10 = name.replace('a', 'i');
        System.out.println(result10);

    }
}
