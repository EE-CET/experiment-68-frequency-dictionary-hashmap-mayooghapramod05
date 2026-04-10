import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> freqMap = new LinkedHashMap<>();
        
        // Read the line first, then split by whitespace
        // This is often more reliable for autograders than scanner.next()
        if (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line != null && !line.trim().isEmpty()) {
                String[] words = line.trim().split("\\s+");
                for (String word : words) {
                    freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
                }
            }
        }
        
        // Print the results
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        scanner.close();
    }
}
