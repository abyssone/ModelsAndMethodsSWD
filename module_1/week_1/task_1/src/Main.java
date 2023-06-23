import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName;

        System.out.println("Input your name: ");
        userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}