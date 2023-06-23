import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        int inputInt = 0;

        System.out.println("Enter numbers ('-1' to complete input)");
        while(true){
            inputInt = scanner.nextInt();
            if(inputInt == -1) break;
            nums.add(scanner.nextInt());
        }

        List<List<Integer>> permutations = perms(nums);

        System.out.println(permutations);
    }
    public static List<List<Integer>> perms(List<Integer> nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, List<Integer> nums) {
        if (tempList.size() == nums.size()) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.size(); i++) {
                if (tempList.contains(nums.get(i))) {
                    continue;
                }
                tempList.add(nums.get(i));
                backtrack(result, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}