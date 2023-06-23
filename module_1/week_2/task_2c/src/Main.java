import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        int[] array;
        int[] primeNumbers;

        while(true){
            System.out.println("Input value greater than 2");
            value = Math.abs(scanner.nextInt());
            if(isInvalidValue(value)){
                System.out.println("Invalid value");
                continue;
            }
            break;
        }

        array  = IntStream.rangeClosed(0, value).toArray();
        primeNumbers = useEratosthenesMethod(array);

        for (int el: primeNumbers)
        {
            System.out.println(el);
        }

    }

    private static int[] useEratosthenesMethod(int[] arr){
        int n = 2;

        arr[1] = 0;
        while(Math.pow(n, 2) < arr.length){
            for(int i = (int) Math.pow(n, 2); i <= arr.length ;i += n){
                arr[i] = 0;
            }
            n++;
        }

        int[] filteredArray = new int[getValuesNum(arr)];
        int pfilteredArray = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                filteredArray[pfilteredArray] = arr[i];
                pfilteredArray++;
            }
        }
        return filteredArray;
    }
    private static int getValuesNum(int[] arr){
        int length = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0) length++;
        }
        return length;
    }
    private static boolean isInvalidValue(int v){
        return v < 2;
    }
}
