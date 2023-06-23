import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        String years;

        System.out.println("Введите Ваш возраст: ");
        age = scanner.nextInt();

        switch (age % 10) {
            case 1:
                if (age % 100 != 11) {
                    years = "год";
                } else {
                    years = "лет";
                }
                break;
            case 2, 3, 4:
                if (age % 100 < 10 || age % 100 >= 20) {
                    years = "года";
                } else {
                    years = "лет";
                }
                break;
            default:
                years = "лет";
                break;
        }
        System.out.println(age + " " + years);
    }
}