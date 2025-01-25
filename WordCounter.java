import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter a string to count words:");
        String input = scanner.nextLine();

        // Split input string into words using space and punctuation delimiters
        String[] words = input.trim().split("\\s+|[.,!?;:\\-]");

        // Count words
        int wordCount = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount++;
            }
        }

        // Display result
        System.out.println("Total words: " + wordCount);

        // Count frequency of each word
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                word = word.toLowerCase(); // Convert to lowercase for case-insensitive counting
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        }

        // Display word frequency
        System.out.println("Word frequencies:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

