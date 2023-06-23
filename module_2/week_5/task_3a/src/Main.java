import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите данные: ");
        String[] arrayStr = scanner.nextLine().split(",");
        int[] arr = new int[arrayStr.length];
        for (int i = 0; i < arrayStr.length; i++) {
            arr[i] = Integer.parseInt(arrayStr[i]);
        }

        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }

        int[] newArr = new int[set.size()];
        int index = 0;
        for (int i : set) {
            newArr[index++] = i;
        }

        System.out.println(Arrays.toString(newArr));
    }
}