import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sensor data: ");
        String sensorData = scanner.nextLine();
        System.out.print("Sort by (id or temp): ");
        String sortBy = scanner.nextLine();
        String[] readings = sensorData.split("@");
        int[] ids = new int[readings.length];
        int[] temps = new int[readings.length];

        for (int i = 0; i < readings.length; i++) {
            ids[i] = Integer.parseInt(readings[i].substring(0, 2));
            temps[i] = Integer.parseInt(readings[i].substring(2));
        }
        int[] sortedIds = sortById(ids);
        double[] avgTemps = calculateAvgTemps(ids, temps);
        if (sortBy.equals("id")) {
            for (int sortedId : sortedIds) {
                System.out.printf("%d %.1f\n", sortedId, avgTemps[sortedId]);
            }
        } else if (sortBy.equals("temp")) {
            int[] sortedByTempIds = sortByTemp(avgTemps, sortedIds);
            for (int sortedByTempId : sortedByTempIds) {
                System.out.printf("%d %.1f\n", sortedByTempId, avgTemps[sortedByTempId]);
            }
        } else {
            System.out.println("Invalid sort option.");
        }
    }

    public static int[] sortById(int[] ids) {
        int[] sortedIds = new int[ids.length];
        System.arraycopy(ids, 0, sortedIds, 0, ids.length);
        for (int i = 0; i < sortedIds.length - 1; i++) {
            for (int j = i + 1; j < sortedIds.length; j++) {
                if (sortedIds[i] > sortedIds[j]) {
                    int temp = sortedIds[i];
                    sortedIds[i] = sortedIds[j];
                    sortedIds[j] = temp;
                }
            }
        }
        int uniqueCount = 1;
        for (int i = 1; i < sortedIds.length; i++) {
            if (sortedIds[i] != sortedIds[i-1]) {
                uniqueCount++;
            }
        }
        int[] uniqueIds = new int[uniqueCount];
        uniqueIds[0] = sortedIds[0];
        int index = 1;
        for (int i = 1; i < sortedIds.length; i++) {
            if (sortedIds[i] != sortedIds[i-1]) {
                uniqueIds[index] = sortedIds[i];
                index++;
            }
        }
        return uniqueIds;
    }

    public static double[] calculateAvgTemps(int[] ids, int[] temps) {
        double[] sumTemps = new double[100];
        double[] countTemps = new double[100];
        double[] avgTemps = new double[100];
        for (int i = 0; i < ids.length; i++) {
            sumTemps[ids[i]] += temps[i];
            countTemps[ids[i]]++;
        }
        for (int i = 0; i < avgTemps.length; i++) {
            if (countTemps[i] > 0) {
                avgTemps[i] = sumTemps[i] / countTemps[i];
            }
        }
        return avgTemps;
    }

    public static int[] sortByTemp(double[] temps, int[] ids) {
        int[] sortedByTempIds = new int[ids.length];
        double[] sortedTemp = new double[ids.length];
        System.arraycopy(ids, 0, sortedByTempIds, 0, ids.length);
        for (int i = 0; i < ids.length; i++){
            sortedTemp[i] = temps[sortedByTempIds[i]];
        }

        for (int i = 0; i < sortedByTempIds.length - 1; i++) {
            for (int j = i + 1; j < sortedByTempIds.length; j++) {
                if (sortedTemp[i] > sortedTemp[j]) {
                    int temp = sortedByTempIds[i];
                    sortedByTempIds[i] = sortedByTempIds[j];
                    sortedByTempIds[j] = temp;
                    double dTemp = sortedTemp[i];
                    sortedTemp[i] = sortedTemp[j];
                    sortedTemp[j] = dTemp;
                }
            }
        }
        return sortedByTempIds;
    }
}