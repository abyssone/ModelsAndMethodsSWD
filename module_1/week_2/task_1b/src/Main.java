import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month;
        int year;
        int days;

        System.out.println("Input number of month:");
        month = scanner.nextInt();
        System.out.println("Input year:");
        year = scanner.nextInt();

        switch (month) {
            case 2:
                if (year % 4 == 0) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 4, 6, 9, 11:
                days = 30;
                break;
            default:
                days = 31;
                break;
        }
        System.out.println("Number of days in a month - " + days);
    }
}