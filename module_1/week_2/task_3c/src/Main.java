public class Main {
    public static void main(String[] args) {
        int[] array = {0, 1, 10, -10, 5, 0, -3, -10, -10, -2};

        int[] result = arrayMode(array);
        System.out.println("Mode: " + result[0] + "\nRepeats: " + result[1]);
    }

    // Return mode of numbers as first element and repetitions number as second value.
    private static int[] arrayMode(int[] arr){
        int currentMode = arr[0];
        int modeRepetitions = 0;
        int currentValue = arr[0];
        int currentRepetitions = 0;

        bubbleSort(arr);
        for(int elem: arr){
            if(elem != currentValue){
                if(currentRepetitions > modeRepetitions){
                    modeRepetitions = currentRepetitions;
                    currentMode = currentValue;
                }
                currentValue = elem;
                currentRepetitions = 0;
            }
            currentRepetitions++;
        }
        return new int[] {currentMode, modeRepetitions};
    }

    private static void bubbleSort(int[] sortArr){
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
    }
}
