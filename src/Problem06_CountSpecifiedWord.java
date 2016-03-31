import java.util.HashMap;
import java.util.Scanner;

public class Problem06_CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String inputString = console.nextLine();
        String[] allWords = inputString.toLowerCase().split("\\W+");
        String word = console.nextLine().toLowerCase();

        HashMap<String, Integer> wordsCount = new HashMap<>();

        for (String currentWord : allWords) {
            if (!wordsCount.containsKey(currentWord)) {
                wordsCount.put(currentWord, 1);
            } else {
                int counter = wordsCount.get(currentWord) + 1;
                wordsCount.put(currentWord, counter);
            }
        }

        if (wordsCount.containsKey(word)) {
            System.out.println(wordsCount.get(word));
        } else {
            System.out.println(0);
        }
    }
}
