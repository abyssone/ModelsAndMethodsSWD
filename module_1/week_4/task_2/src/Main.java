import com.sun.jdi.CharValue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputValue;
        String inputType;

        System.out.println("Input value");
        inputValue = scanner.nextLine();
        System.out.println("Select type:\n1. Byte\n2. Short\n3. Int\n4. Long\n5. Double\n6. Float\n7. Char\n8. Boolean");
        inputType = scanner.nextLine();
        try{
            switch (Integer.parseInt(inputType)){
                case 1:
                    byte byteValue = Byte.parseByte(inputValue);
                    System.out.println(byteValue);
                    break;
                case 2:
                    short shortValue = Byte.parseByte(inputValue);
                    System.out.println(shortValue);
                    break;
                case 3:
                    int intValue = Integer.parseInt(inputValue);
                    System.out.println(intValue);
                    break;
                case 4:
                    long longValue = Long.parseLong(inputValue);
                    System.out.println(longValue);
                    break;
                case 5:
                    double doubleValue = Double.parseDouble(inputValue);
                    System.out.println(doubleValue);
                    break;
                case 6:
                    float floatValue = Float.parseFloat(inputValue);
                    System.out.println(floatValue);
                    break;
                case 7:
                    char charValue = inputValue.charAt(0);
                    System.out.println(charValue);
                    break;
                case 8:
                    boolean booleanValue = Boolean.parseBoolean(inputValue);
                    System.out.println(booleanValue);
                    break;
                default:
                    System.out.println("Incorrect input");
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}