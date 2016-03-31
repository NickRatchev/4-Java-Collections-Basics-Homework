import java.util.Scanner;
import java.util.TreeSet;

public class Problem08_ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] inputStr = console.nextLine().split("\\W+");
        TreeSet<String> words = new TreeSet<>();

        for (String currentWord : inputStr) {
            words.add(currentWord.toLowerCase());
        }

        for (String currentWord : words) {
            System.out.print(currentWord + " ");
        }
    }
}
