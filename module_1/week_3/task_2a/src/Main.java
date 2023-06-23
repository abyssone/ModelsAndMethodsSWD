import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String inputString = "";
        Scanner scanner = new Scanner(System.in);

        while(!inputString.equals("0")){
            System.out.println("Input any email address ('0' for exit):");
            inputString = scanner.nextLine();
            if(isEmail(inputString)){
                System.out.println("It's correct email address!");
            } else{
                System.out.println("It's something unknown");
            }
        }

    }

    private static boolean isEmail(String address){
        String regex = "^\\w+@[a-zA-Z]+[.][a-zA-Z]+";
        return Pattern.matches(regex, address);
    }
}
