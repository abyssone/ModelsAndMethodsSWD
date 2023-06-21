import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString;

        System.out.println("Input string");
        inputString = scanner.nextLine();
        System.out.println(removeRepeatingChars(inputString));
    }
    public static String removeRepeatingChars(String str){
        String result = str.replaceAll("(.)\\1{2,}", "$1");
        return result;
    }
}