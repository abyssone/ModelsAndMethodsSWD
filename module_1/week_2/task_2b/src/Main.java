import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;

        System.out.println("Input value");
        value = scanner.nextInt();
        System.out.println("Cube root = " + cubeRoot(value));
    }

    private static double cubeRoot(int val) {
        double accuracy = 0.01;
        double minRemainder = val;
        double remainder1 = val;
        double remainder2 = val;
        double x0 = val > 0 ? 0 : val;
        double x1 = val > 0 ? val : 0;
        double currentResult = val;

        while (Math.abs(minRemainder) > accuracy) {
            if (Math.pow(x1, 3) < val) {
                x0 = x1;
                x1 += remainder2;
            } else if (Math.pow(x0, 3) > val) {
                x1 = x0;
                x0 -= remainder1;
            }
            remainder1 = findLength(Math.pow(x0, 3), val);
            remainder2 = findLength(Math.pow(x1, 3), val);
            if (remainder1 < remainder2) {
                minRemainder = remainder1;
                x1 = findCenter(x0, x1);
                currentResult = x0;
            } else {
                minRemainder = remainder2;
                x0 = findCenter(x0, x1);
                currentResult = x1;
            }
        }
        return currentResult;
    }

    private static double findLength(double a, double b) {
        return a > b ? a - b : b - a;
    }

    private static double findCenter(double a, double b) {
        double halfLen = findLength(a, b) / 2;
        double modCenter = Math.abs(a) < Math.abs(b) ? halfLen + Math.abs(a) : halfLen + Math.abs(b);
        return Math.abs(a) > Math.abs(b) ? modCenter * Math.signum(a) : modCenter * Math.signum(b);
    }
}