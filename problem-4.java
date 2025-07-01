import java.util.*;

public class MultiplesCounter {
    public static void main(String[] args) {
        // Input array
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        // Map to store counts for 1 to 9
        Map<Integer, Integer> countMap = new HashMap<>();

        // Initialize the map with keys 1 to 9
        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0);
        }

        // Count divisible numbers
        for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int num : numbers) {
                if (num % i == 0) {
                    count++;
                }
            }
            countMap.put(i, count);
        }

        // Output
        System.out.println("Output:");
        System.out.println(countMap);
    }
}