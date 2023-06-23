import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        String[] splitInput;
        Map<String, String[]> engLatDictionary = new HashMap<>();
        Map<String, String[]> latEngDictionary = new HashMap<>();

        System.out.println("Enter Eng-Lat dictionary (\"0\" for exit)");
        while(!input.equals("0")){
            input = scanner.nextLine();
            splitInput = stringToKeyValues(input);
            engLatDictionary.put(splitInput[0], Arrays.copyOfRange(splitInput, 1, splitInput.length));
        }

        for(Map.Entry<String, String[]> entry: engLatDictionary.entrySet()) {
            for(String value: entry.getValue()){
                if(latEngDictionary.containsKey(value)){
                    latEngDictionary.put(value, append(latEngDictionary.get(value), entry.getKey()));
                } else{
                    latEngDictionary.put(value, new String[]{entry.getKey()});
                }
            }
        }
        System.out.println("Lat-Eng dictionary:");
        for(Map.Entry<String, String[]> entry: latEngDictionary.entrySet()){
            System.out.println(entry.getKey() + " - " + String.join(", ", entry.getValue()));
        }

    }
    private static String[] stringToKeyValues(String str){
        String[] result = str.split("(\\s\\-\\s)|(\\,\\s)");
        return result;
    }
    private static <T> T[] append(T[] arr, T element) {
        final int N = arr.length;
        arr = Arrays.copyOf(arr, N + 1);
        arr[N] = element;
        return arr;
    }
}