import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> freqMap = new LinkedHashMap<>();
        
        // Use hasNext() to read word by word, which ignores leading/trailing whitespace automatically
        while (scanner.hasNext()) {
            String word = scanner.next();
            
            // Just in case there are empty strings being caught
            if (!word.isEmpty()) {
                freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
            }
        }
        
        // Use a standard for-loop for maximum compatibility with autograders
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        scanner.close();
    }
}
