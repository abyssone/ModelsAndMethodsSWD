import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width;

        System.out.print("Enter the width of the pyramid: ");
        width = scanner.nextInt();
        for (int i = 1; i <= width; i++) {
            System.out.print(" ".repeat(width-i));
            System.out.print("#".repeat(i));
            System.out.print(" ");
            System.out.print("#".repeat(i));
            System.out.println();
        }
    }
}