import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> buyers = new TreeMap<>();
        String fileDirectory = System.getProperty("user.dir") + "\\src\\" + "sales.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileDirectory))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                String buyer = parts[0];
                String item = parts[1];
                int quantity = Integer.parseInt(parts[2]);

                if (!buyers.containsKey(buyer)) {
                    buyers.put(buyer, new TreeMap<>());
                }
                Map<String, Integer> items = buyers.get(buyer);
                items.put(item, items.getOrDefault(item, 0) + quantity);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (Map.Entry<String, Map<String, Integer>> entry : buyers.entrySet()) {
            String buyer = entry.getKey();
            Map<String, Integer> items = entry.getValue();
            System.out.println(buyer + ":");
            for (Map.Entry<String, Integer> itemEntry : items.entrySet()) {
                String item = itemEntry.getKey();
                int quantity = itemEntry.getValue();
                System.out.println(item + " " + quantity);
            }
        }
    }
}