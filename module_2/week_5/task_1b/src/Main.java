import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество дней: ");
        int numDays = scanner.nextInt();

        int[] prices = new int[numDays];
        System.out.println("Введите цены акций для каждого дня:");

        for (int i = 0; i < numDays; i++) {
            System.out.print("День " + (i + 1) + ": ");
            prices[i] = scanner.nextInt();
        }

        int maxProfit = maxProfit(prices);
        System.out.println("Максимальная прибыль: " + maxProfit);
    }
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            for(int j = i; j <prices.length; j++){
                maxProfit = (j - i) > maxProfit ? (j - i) : maxProfit;
            }
        }
        return maxProfit;
    }
}