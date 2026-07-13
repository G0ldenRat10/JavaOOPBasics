public class class16TwoDListeArrays {
    public static void main(String[] args) {
        // u prevodu ugnjezdena lista u listi

        // builder:
        String[][] cars = new String[3][3];

        // dodavanje vrednosti:
        cars[0][0] = "Mazda";
        cars[0][1] = "Corvete";
        cars[0][2] = "Chevrolete";
        cars[1][0] = "Mazda";
        cars[1][1] = "Corvete";
        cars[1][2] = "Chevrolete";
        cars[2][0] = "Mazda";
        cars[2][1] = "Corvete";
        cars[2][2] = "Chevrolete";

        // Display:

        for(int i = 0; i < cars.length; i++) {
            for(int j = 0; j < cars.length; j++) {
                System.out.println("Number "+i+","+j+" is car: "+cars[i][j]);
            }

        }

        // Dodeljivanje direktno hardcodov-ano

        String[][] cars2 = {{"Camaro", "Mazda", "BMW"},
                            {"Mustang", "Mercedes", "Tesla"},
                            {"Hyndai","Ford","Citroen"}
            };
    }
}
