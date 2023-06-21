import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double edgeLength;

        System.out.println("Input length of edge");
        edgeLength = scanner.nextDouble();
        System.out.println("result = " + calcDodecVolume(edgeLength));
    }

    private static double calcDodecVolume(double edgeLength){
        double volume = Math.pow(edgeLength, 3) / 4 * (15 + 7 * Math.sqrt(5));
        return volume;
    }
}
