public class _8_switch {
    public static void main(String[] args) {
        // switch = statement that allows a variavle to be tested for equality against a
        // list of values ..

        String day = "food";

        switch (day) {
            case "Sunday":
                System.out.println("It is Sunday!");
                break;

            case "Monday":
                System.out.println("It is Monday!");
                break;

            case "Tuseday":
                System.out.println("It is Tuseday!");
                break;

            case "Wednesday":
                System.out.println("It is Wednesday!");
                break;

            case "Thursday":
                System.out.println("It is Thursday!");
                break;

            case "Friday":
                System.out.println("It is Friday!");
                break;

            case "Saturday":
                System.out.println("It is Saturday!");
                break;
            default:
                System.out.println("That is not a day!");
        }
    }
}
