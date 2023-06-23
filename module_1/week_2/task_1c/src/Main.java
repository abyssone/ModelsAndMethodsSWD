import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String temperature;
        String weather;
        String wind;
        String humidity;

        System.out.print("Какая сегодня температура? (жарко/тепло/холодно): ");
        temperature = scanner.nextLine();
        System.out.print("Какая сегодня погода? (ясно/облачно/дождь/снег/град): ");
        weather = scanner.nextLine();
        System.out.print("Есть ли сегодня ветер? (да/нет): ");
        wind = scanner.nextLine();
        System.out.print("Какая сегодня влажность? (высокая/низкая): ");
        humidity = scanner.nextLine();

        if (weather.equals("ясно") && wind.equals("нет") && humidity.equals("низкая") && temperature.equals("тепло")) {
            System.out.println("Сегодня можно поиграть в бадминтон!");
        } else {
            System.out.println("Сегодня не получится поиграть в бадминтон");
        }
    }
}