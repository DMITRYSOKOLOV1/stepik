package lesson13_switch;

public class Month {
    int month;

    public static void countDay(int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
            case 2:
                System.out.println(28);
                break;
            default:
                System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        countDay(5);
    }
}

