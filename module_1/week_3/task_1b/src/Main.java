import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();
        double entropy = calculateShannonEntropy(inputString);
        System.out.printf("Энтропии по Шеннону: %.2f", entropy);
    }

    public static double calculateShannonEntropy(String inputString) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        double entropy = 0.0;
        int n = inputString.length();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            double p = (double) entry.getValue() / n;
            entropy -= p * Math.log(p) / Math.log(2);
        }
        return entropy;
    }
}