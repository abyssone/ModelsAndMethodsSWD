import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String inputString = "";
        Scanner scanner = new Scanner(System.in);

        while(!inputString.equals("0")){
            System.out.println("Input any IPv6 address ('0' for exit):");
            inputString = scanner.nextLine();
            if(isIPv6(inputString)){
                System.out.println("It's correct IPv6 address!");
            } else{
                System.out.println("It's something unknown");
            }
        }

    }

    private static boolean isIPv6(String address){
        String regex = "^([\\da-fA-F]{4}:){7}[\\da-fA-F]{4}";
        return Pattern.matches(regex, address);
    }
}
