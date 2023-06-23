import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string to search for: ");
        String searchString = scanner.nextLine();
        System.out.print("Enter the number of strings to search in: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] inputStrings = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter string %d: ", i + 1);
            inputStrings[i] = scanner.nextLine();
        }

        int count = 0;
        for (String inputString : inputStrings) {
            if (inputString.contains(searchString)) {
                count++;
            }
        }
        System.out.printf("Найдено вхождений: %d", count);
    }
}