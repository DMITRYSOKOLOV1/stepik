package lesson13_switch;

public class Employee {
    public static void main(String[] args) {
        switch ("tuesday") {    // Только int byte short char и String
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
                System.out.println("work 9-18");
                break;
            case "friday":
                System.out.println("work 9-17");
                break;
            case "saturday":
                System.out.println("work 12-16");
                break;
            case "sunday":
                System.out.println("chill");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
