import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> freqMap = new LinkedHashMap<>();
        
        while (scanner.hasNext()) {
            String word = scanner.next();
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }
        
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        scanner.close();
    }
}
