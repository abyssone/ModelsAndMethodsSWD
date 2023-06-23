import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите данные: ");
        String[] heightsStr = scanner.nextLine().split(",");
        int[] heights = new int[heightsStr.length];
        for (int i = 0; i < heightsStr.length; i++) {
            heights[i] = Integer.parseInt(heightsStr[i]);
        }
        System.out.println("Вывод: " + maxArea(heights));
    }
    public static int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1;
        int maxArea = 0;
        while (left < right) {
            int currentArea = Math.min(heights[left], heights[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}