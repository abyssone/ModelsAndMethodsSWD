public class Main {
    public static void main(String[] args) {
        int[] array = {0, 1, 10, -10, 5, 0, -3, -10, -10, -2};

        System.out.println("Number of minimum elemts: "+ findNumberOfMin(array));
    }

    private static int findMin(int[] arr){
        int min = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min) min = arr[i];
        }
        return min;
    }

    private static int findNumberOfMin(int[] arr){
        int minNum = 0;
        int minValue = findMin(arr);
        for(int elem: arr){
            if(elem == minValue) minNum++;
        }
        return minNum;
    }
}
