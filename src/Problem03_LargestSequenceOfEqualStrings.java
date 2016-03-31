import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Problem03_LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] strings = console.nextLine().split(" ");
        LinkedHashMap<String, Integer> stringCount = new LinkedHashMap<String, Integer>();

        for (String string : strings) {
            if (stringCount.containsKey(string)) {
                int currentCount = stringCount.get(string) + 1;
                stringCount.put(string, currentCount);
            } else {
                stringCount.put(string, 1);
            }
        }

        String maxString = "";
        int maxCount = 0;

        for (String string : stringCount.keySet()) {
            if (stringCount.get(string) > maxCount) {
                maxString = string;
                maxCount = stringCount.get(string);
            }
        }

        for (int i = 0; i < maxCount; i++) {
            System.out.print(maxString + " ");
        }
    }
}
