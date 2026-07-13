public class class10SwitchCase {
    public static void main(String[] args) {
        // switch = statement koji dozvoljava promenljivoj da bude testirana za
        // njenu verdnost pored liste ostalih vrednosti dok se ne udari ona koja je bas ta trazena

        String day = "Sunday";

        switch(day) {
            case "Monday": System.out.println("It is Monday!");
            break;
            case "Tuesday": System.out.println("It is Tuesday!");
            break;
            case "Wednesday": System.out.println("It is Wednesday!");
            break;
            case "Thursday": System.out.println("It is Thursday!");
            break;
            case "Friday": System.out.println("It is Friday!");
            break;
            case "Saturday": System.out.println("It is Saturday!");
            break;
            case "Sunday": System.out.println("It is Sunday!");
            break;
            default: System.out.println("That is not a day!");
        }

    }
}
