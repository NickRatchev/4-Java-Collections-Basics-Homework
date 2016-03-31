import java.util.Scanner;
import java.util.TreeMap;

public class Problem09_MostFrequentWord {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] inputStr = console.nextLine().split("\\W+");
        TreeMap<String, Integer> words = new TreeMap<>();

        int maxCount = 0;
        for (String word : inputStr) {
            if (words.keySet().contains(word)) {
                int counter = words.get(word) + 1;
                if (counter > maxCount) {
                    maxCount = counter;
                }
                words.put(word.toLowerCase(), counter);
            } else {
                if (maxCount < 1) {
                    maxCount = 1;
                }
                words.put(word.toLowerCase(), 1);
            }
        }

        for (String word : words.keySet()) {
            if (words.get(word) == maxCount) {
                System.out.printf("%s -> %d times\r\n", word, words.get(word));
            }
        }
    }
}
